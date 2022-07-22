package com.demo;

import com.demo.abstractFactory.*;
import com.demo.adapter.Adapter;
import com.demo.adapter.Target;
import com.demo.bridge.Abstraction;
import com.demo.bridge.ImplementorA;
import com.demo.bridge.ImplementorB;
import com.demo.bridge.RefinedAbstraction;
import com.demo.builder.*;
import com.demo.command.*;
import com.demo.composite.ConcreteCompany;
import com.demo.composite.FinanceDepartment;
import com.demo.composite.HRDepartment;
import com.demo.decorator.Person;
import com.demo.decorator.Shirt;
import com.demo.decorator.Suit;
import com.demo.decorator.TShirts;
import com.demo.dutyChain.CommonManager;
import com.demo.dutyChain.GeneralManager;
import com.demo.dutyChain.Majordomo;
import com.demo.dutyChain.Request;
import com.demo.factoryMethod.LeiFeng;
import com.demo.factoryMethod.StudentFactory;
import com.demo.factoryMethod.VolunteerFactory;
import com.demo.flyweight.WebSite;
import com.demo.flyweight.WebSiteFactory;
import com.demo.iterator.ConcreteAggreaget;
import com.demo.iterator.ConcreteIterator;
import com.demo.iterator.Iterator;
import com.demo.mediator.Iraq;
import com.demo.mediator.USA;
import com.demo.mediator.UnitedNationsSecurityCouncil;
import com.demo.memento.Player;
import com.demo.memento.PlayerStateCaretaker;
import com.demo.observer.ConcreateObserver;
import com.demo.observer.ConcreateSubject;
import com.demo.prototype.ConcretePrototype;
import com.demo.proxy.Proxy;
import com.demo.proxy.SchoolGirl;
import com.demo.simpleFactory.Operation;
import com.demo.simpleFactory.OperationFactory;
import com.demo.state.Work;
import com.demo.strategy.CashContext;
import com.demo.template.TestPaperA;
import com.demo.template.TestPaperB;
import com.demo.visitor.*;
import org.junit.Test;

public class TestMain {

    /**
     * @author: caiming
     * @Date: 2022/7/21 11:37
     * @Description: 抽象工厂模式
     * 提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体得类
     */
    @Test
    public void testAbstractFactory() {
        User user = new User();
        Department department = new Department();
        //調用方通過初始化sqlserver工廠或mysql工廠，就可以獲得具體的配置，实现了数据库的切换
        //IFactory factory = new SqlServerFactory();
        IFactory factory = new MysqlFactory();
        factory.createUser().insertUser(user);//此時已經與具體的數據庫訪問解除了依賴
        factory.createDepartment().createDepartment(department);
        //用反射+抽象工厂来改进数据访问程序
        DataAccess.createUser().insertUser(user);
    }

    /**
     * @author: caiming
     * @Date: 2022/7/21 11:38
     * 适配器模式
     * 将一个类的接口转换成客户希望的另外一个接口。使得原本不兼容而不能一起工作的那些类可以一起工作
     */
    @Test
    public void testAdapter() {
        //对于客户端来说，调用的是Target的request，实际执行的是Adaptee的request
        Target target = new Adapter();
        target.request();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:19
     *  @Description:
     *  桥接模式
     *  将抽象部分与它的实现部分分离，使它们可以独立变化，减少它们之间的耦合
     */
    @Test
    public void testBridge(){
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ImplementorA());
        ab.opertion();
        ab.setImplementor(new ImplementorB());
        ab.opertion();
    }


    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:21
     *  @Description:
     *  建造者模式
     *  将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
     */

    @Test
    public void testBuilder(){
        Director director = new Director();
        Builder builderA = new BuilderA();
        director.construct(builderA);
        Product a = builderA.getProduct();
        a.show();
        Builder builderB = new BuilderB();
        director.construct(builderB);
        Product b = builderB.getProduct();
        b.show();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:23
     *  @Description:
     *  命令模式
     * 将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作
     * 优点：
     * 1、它能较轻易的设计一个命令队列；
     * 2、在需要的情况下，可以较容易的将命令记入日志
     * 3、允许接收请求的一方决定是否拒绝请求
     * 4、可以容易的实现对请求的撤销或重做
     * 5、加进新的命令类而不影响其他的类
     */
    @Test
    public void testCommand(){
        // 开店前的准备
        Barbecuer boy = new Barbecuer();
        Command cmd1 = new BakeMuttonCommand(boy);
        Command cmd2 = new BakeMuttonCommand(boy);
        Command cmd3 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();
        girl.setOrder(cmd1);
        girl.setOrder(cmd2);
        girl.setOrder(cmd3);
        girl.excute();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:25
     *  @Description:
     *  组合模式
     *  将对象组合成树行结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
     */

    @Test
    public void testComposite(){
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("北京总公司人力资源部"));
        root.add(new FinanceDepartment("北京总公司财务部"));
        ConcreteCompany comp = new ConcreteCompany("南京分公司");
        comp.add(new HRDepartment("南京分公司人力资源部"));
        comp.add(new FinanceDepartment("南京分公司财务部"));
        root.add(comp);
        ConcreteCompany comp2 = new ConcreteCompany("长沙分公司");
        comp2.add(new HRDepartment("长沙分公司人力资源部"));
        comp2.add(new FinanceDepartment("长沙分公司财务部"));
        root.add(comp2);
        System.out.println("组织架构：");
        root.display(1);
        System.out.println("职责：");
        root.lineOfDuty();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:37
     *  @Description:
     *  裝飾模式
     *  动态给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活
     * 装饰模式是为已有的功能动态的添加更多功能的一种方式
     */
    @Test
    public void testDecorator(){
        Person p = new Person("jack");
        System.out.println("first:");
        Suit suit = new Suit();
        Shirt shirt = new Shirt();
        TShirts th = new TShirts();
        suit.decorate(p);
        shirt.decorate(suit);
        th.decorate(shirt);
        th.show();
        System.out.println("second:");
        shirt.decorate(p);
        th.decorate(shirt);
        suit.decorate(th);
        suit.show();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:39
     *  @Description:
     *  职责链模式
     *  使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理为止。
     */

    @Test
    public void testDutyChain(){
        CommonManager jinli = new CommonManager("金立");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager lisi = new GeneralManager("李四");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(lisi);

        Request request = new Request();
        request.setRequestContent("小菜请假");
        request.setRequestType(Request.REQUEST_TYPE_LEAVE);
        request.setNumber(1);
        jinli.requestApplications(request);

        Request request2 = new Request();
        request2.setRequestContent("小菜请假");
        request2.setRequestType(Request.REQUEST_TYPE_LEAVE);
        request2.setNumber(5);
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestContent("小菜加薪");
        request3.setRequestType(Request.REQUEST_TYPE_RAISES);
        request3.setNumber(2000);
        jinli.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestContent("小菜加薪");
        request4.setRequestType(Request.REQUEST_TYPE_RAISES);
        request4.setNumber(6000);
        jinli.requestApplications(request4);

        Request request5 = new Request();
        request5.setRequestContent("小菜请假");
        request5.setRequestType(Request.REQUEST_TYPE_LEAVE);
        request5.setNumber(30);
        jinli.requestApplications(request5);
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:43
     *  @Description:
     *  工厂方法模式
     *  定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类
     */

    @Test
    public void testFactoryMethod(){
        com.demo.factoryMethod.IFactory factory = new StudentFactory();
        LeiFeng student = factory.createLeiFeng();
        student.sweep();
        com.demo.factoryMethod.IFactory factory1 = new VolunteerFactory();
        LeiFeng volunteer = factory1.createLeiFeng();
        volunteer.wash();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:46
     *  @Description:
     *  享元模式
     * 于用共享技术有效的支持大量细粒度的对象
     * 享元模式可以避免大量非常相似的开销。在程序设计中，有时需要生成大量细粒度的实例来表示数据。如果发现这些实例除了几个参数外都是相同的，
     * 有时就能够大幅减少需要实例化的类的数量。如果能把那些参数移到类实例的外面，在方法调用时将它们传递进来，就可以通过共享大幅减少单个实例的数目
     */

    @Test
    public void testFlyweight(){
        WebSiteFactory f = new WebSiteFactory();
        WebSite fx = f.getWebSiteCategory("产品展示");
        fx.use(new com.demo.flyweight.User("a"));

        WebSite fy = f.getWebSiteCategory("产品展示");
        fy.use(new com.demo.flyweight.User("b"));

        WebSite fz = f.getWebSiteCategory("博客");
        fz.use(new com.demo.flyweight.User("z"));

        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 8:57
     *  @Description:
     *  迭代器模式
     * 提供一种方式顺序访问一个聚合对象中各个元素，而不暴露该对象的内部表示
     * 为遍历不同的聚集结构提供如：开始、下一个、是否结束、当前哪一项等统一的接口
     */

    @Test
    public void testIterator(){
        ConcreteAggreaget aggreaget = new ConcreteAggreaget();
        aggreaget.set(0, "张三");
        aggreaget.set(1, "李四");
        aggreaget.set(2, "王五");
        aggreaget.set(3, "赵六");

        Iterator<String> i = new ConcreteIterator(aggreaget);
        while (!i.isDone()) {
            System.out.println(i.currentItem() + " 请买车票～");
            i.next();
        }
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 9:03
     *  @Description:
     *  中介者模式
     * 用一個中介对象来封装一系列的对象交互。中介者使各对象不需要显式的相互引用，从而使其耦合松散，而且可以独立的改变它们之间的交互
     * 当系统出现了“多对多”交互复杂的对象群时，不要急于使用中介者模式，而要反思你的系统在设计上是否合理
     * 中介者模式一般應用於一组对象已定义良好，但是复杂的方式进行通信的场合
     */

    @Test
    public void testMediator(){
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();//聯合國安理會 做為美國和伊拉克的中介者

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则发动战争");
        c2.declare("我们没有核武器，也不怕侵略");
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 9:05
     *  @Description:
     *  备忘录模式
     * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态
     * 備忘錄模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类
     * 如果在某个系统中使用命令模式时，需要实现命令的撤销功能，那么命令模式可以使用备忘录模式来存储可撤销的操作的状态
     */

    @Test
    public void testMemento(){
        System.out.println("player init...");
        Player player = new Player();
        player.getInitState();
        player.display();

        System.out.println("player memento...");
        PlayerStateCaretaker stateAdmin = new PlayerStateCaretaker();
        stateAdmin.setMemento(player.saveState());

        System.out.println("player fight and dead..");
        player.dead();
        player.display();

        System.out.println("player recover...");
        player.recoverState(stateAdmin.getMemento());
        player.display();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:15
     *  @Description:
     *  观察者模式
     * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
     */

    @Test
    public void testObserver(){
        ConcreateSubject s = new ConcreateSubject();
        s.attach(new ConcreateObserver(s, "X"));
        s.attach(new ConcreateObserver(s, "Y"));
        s.setSubjectState("abc");
        s.notice();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:16
     *  @Description:
     *  原型模式
     *  用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
     */

    @Test
    public void testPrototype() throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype("1");
        ConcretePrototype c2 = c1.clone();
        System.out.println(c2.getId());
        System.out.println(c1);
        System.out.println(c2);
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:18
     *  @Description:
     *  代理模式
     * 为其他对象提供一种代理以控制这个对象的访问
     * 应用场合：
     * 1、远程代理，也就是为一个对象在不同的地址空间提供局部代表，这样可以隐藏一个对象存在于不同地址空间的事实。如：webservice
     * 2、虚拟代理，是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
     * 3、安全代理，用来控制真实对象访问时的权限
     * 4、智能指引，是指当调用真实的对象时，代理处理另外一些事
     */

    @Test
    public void testProxy(){
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("jiaojiao");

        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:30
     *  @Description:
     *  简单工厂模式
     */

    @Test
    public void testSimpleFactory(){
        Operation operAdd = OperationFactory.getOpertion("+");
        operAdd.setA(11);
        operAdd.setB(12);
        double resultAdd = operAdd.getResult();
        System.out.println("+,"+resultAdd);

        Operation operMul = OperationFactory.getOpertion("*");
        operMul.setA(11);
        operMul.setB(12);
        double resultMul = operMul.getResult();
        System.out.println("*,"+resultMul);
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:31
     *  @Description:
     *  状态模式
     * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类
     * 主要解決的当控制一个对象状态转换的条件表达式过于复杂的情况。把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把複雜的邏輯簡化
     */

    @Test
    public void testState(){
        Work work = new Work();
        work.setHour(10);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();

        work.setHour(19);
        work.writeProgram();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:32
     *  @Description:
     *  策略模式
     *  它定义了算法家族，分别封装起来，让它们之间可以互相转换，此模式让算法的变化，不会影响到使用算法的客户
     *  策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以使用策略模式处理这种变化的可能性
     */

    @Test
    public void testStrategy(){
        CashContext cc = new CashContext("normal");
        double normalResult = cc.getResult(100);
        System.out.println("normal:" + normalResult);

        CashContext cc1 = new CashContext("rebate");
        double rebateResult = cc1.getResult(100);
        System.out.println("normal:" + rebateResult);
    }


    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:33
     *  @Description:
     *  模板方法模式
     * 定义一个操作中的算法骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
     * 模板方法模式是通过把不变行为搬移到超类，去除子类中的重复代码来体现它的优势，提供了一个很好用代码复用平台。
     */

    @Test
    public void testTemplate(){
        TestPaperA a = new TestPaperA();
        a.testQuestion();

        TestPaperB b = new TestPaperB();
        b.testQuestion();
    }

    /**
     *  @author: caiming
     *  @Date: 2022/7/22 10:34
     *  @Description:
     *  访问者模式
     * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作
     * 访问者模式适用于数据结构相对稳定的系统
     * 目的是要把处理从数据结构分离出来
     * 增加操作容易，但增加新的数据结构很困难
     */

    @Test
    public void testvisitor(){
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitorA v1 = new ConcreteVisitorA();
        ConcreteVisitorB v2 = new ConcreteVisitorB();
        o.accept(v1);
        o.accept(v2);
    }
}
