/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.mediator;


public abstract class Country {

	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		this.mediator = mediator;
	}
}
