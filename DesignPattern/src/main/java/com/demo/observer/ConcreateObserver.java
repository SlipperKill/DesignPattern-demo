/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.observer;

/**
 * @Title 
 * @Description 
 * 具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class ConcreateObserver implements Observer {

	private String name;

	private String observerState;

	private ConcreateSubject subject;

	public ConcreateObserver(ConcreateSubject subject, String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println(name + "新状态：" + observerState);
	}

}
