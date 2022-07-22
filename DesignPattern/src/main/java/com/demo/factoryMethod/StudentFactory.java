/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.factoryMethod;
public class StudentFactory implements IFactory {

	@Override
	public LeiFeng createLeiFeng() {
		return new Student();
	}

}

