/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.decorator;

public class Finery extends Person {

	protected Person component;

	public void decorate(Person component) {
		this.component = component;
	}

	public void show() {
		component.show();
	}
}
