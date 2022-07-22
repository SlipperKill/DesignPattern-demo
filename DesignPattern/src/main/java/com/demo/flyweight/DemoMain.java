/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.flyweight;

/**
 * @Title 
 * 享元模式
 * @Description 
 * 于用共享技术有效的支持大量细粒度的对象
 * 享元模式可以避免大量非常相似的开销。在程序设计中，有时需要生成大量细粒度的实例来表示数据。如果发现这些实例除了几个参数外都是相同的，
 * 有时就能够大幅减少需要实例化的类的数量。如果能把那些参数移到类实例的外面，在方法调用时将它们传递进来，就可以通过共享大幅减少单个实例的数目
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategory("产品展示");
		fx.use(new User("a"));
		
		WebSite fy = f.getWebSiteCategory("产品展示");
		fy.use(new User("b"));
		
		WebSite fz = f.getWebSiteCategory("博客");
		fz.use(new User("z"));
		
		System.out.println(fx);
		System.out.println(fy);
		System.out.println(fz);
	}

}

