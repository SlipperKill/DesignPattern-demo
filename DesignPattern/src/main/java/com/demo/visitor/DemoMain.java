/**
 * Created on 2018年5月7日 by caiming
 */
package com.demo.visitor;

/**
 * @Title 
 * 访问者模式
 * @Description 
 * 表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作
 * 访问者模式适用于数据结构相对稳定的系统
 * 目的是要把处理从数据结构分离出来
 * 增加操作容易，但增加新的数据结构很困难
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());

		ConcreteVisitorA v1 = new ConcreteVisitorA();
		ConcreteVisitorB v2 = new ConcreteVisitorB();
		o.accept(v1);
		o.accept(v2);
	}

}
