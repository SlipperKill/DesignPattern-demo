/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.decorator;

/**
 * 
 * @Title 
 * 裝飾模式
 * @Description 
 * 动态给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活
 * 装饰模式是为已有的功能动态的添加更多功能的一种方式
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
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

}
