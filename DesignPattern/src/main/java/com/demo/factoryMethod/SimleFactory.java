/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.factoryMethod;
public class SimleFactory {

	public static LeiFeng createLeiFeng(String type) {
		LeiFeng leifeng = null;
		switch (type) {
		case "学生":
			leifeng = new Student();
			break;

		case "志愿者":
			leifeng = new Volunteer();
			break;
		}

		return leifeng;
	}
}
