/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.factoryMethod;

/**
 * 
 * @Title
 * 工厂方法模式 
 * @Description 
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到子类
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年4月3日 @创建目的【简单工厂模式测试】 @修改目的【修改人：，修改时间：】
	 */
	public static void simpleFactoryTest() {
		LeiFeng l1 = SimleFactory.createLeiFeng("学生");

		l1.buyRice();
		LeiFeng l2 = SimleFactory.createLeiFeng("志愿者");
		l2.sweep();
	}

	/**
	 * 
	 * @创建人 caiming
	 * @创建时间 2018年4月3日 @创建目的【工厂方法模式测试】 @修改目的【修改人：，修改时间：】
	 */
	public static void factoryMethodTest() {
		IFactory factory = new StudentFactory();
		LeiFeng student = factory.createLeiFeng();
		student.sweep();

		IFactory factory1 = new VolunteerFactory();
		LeiFeng volunteer = factory1.createLeiFeng();
		volunteer.wash();
	}

	public static void main(String[] args) {
		// simpleFactoryTest();

		factoryMethodTest();

	}

}
