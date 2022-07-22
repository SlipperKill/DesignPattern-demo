/**
 * Created on 2018年5月8日 by caiming
 */
package com.demo.prototype;

/**
 * @Title
 * 原型模式
 * @Description
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		ConcretePrototype c1 = new ConcretePrototype("1");
		ConcretePrototype c2 = c1.clone();
		System.out.println(c2.getId());
		System.out.println(c1);
		System.out.println(c2);
	}

}
