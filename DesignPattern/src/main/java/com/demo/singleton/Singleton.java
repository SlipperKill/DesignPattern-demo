/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.singleton;

/**
 * @Title 
 * 单例模式
 * @Description 
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
