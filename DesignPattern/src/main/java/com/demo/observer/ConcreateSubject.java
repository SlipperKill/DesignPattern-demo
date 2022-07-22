/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.observer;

/**
 * 
 * @Title 
 * @Description 
 * 具体主题，将有关状态存入具体的观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发送通知
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class ConcreateSubject extends Subject {

	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

}
