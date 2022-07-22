/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.observer;

/**
 * 
 * @Title 
 * 观察者模式
 * @Description 
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		ConcreateSubject s = new ConcreateSubject();
		s.attach(new ConcreateObserver(s, "X"));
		s.attach(new ConcreateObserver(s, "Y"));
		s.setSubjectState("abc");
		s.notice();
	}

}
