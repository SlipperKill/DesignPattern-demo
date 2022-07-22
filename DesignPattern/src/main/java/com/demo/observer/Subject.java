/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @Title 
 * @Description 
 * 把所有对观察者对象的引用都保存在一个聚集里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，它可以增加和删除观察者对象
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notice() {
		for (Observer o : observers) {
			o.update();
		}
	}
}
