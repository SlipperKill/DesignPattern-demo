/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.proxy;

public class Pursuit implements IGiveGift {

	SchoolGirl mm;

	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}

	@Override
	public void giveDolls() {
		System.out.println(mm.getName()+" give dolls");

	}

	@Override
	public void giveFlowers() {
		System.out.println(mm.getName()+" give flowers");

	}

	@Override
	public void giveChocolate() {
		System.out.println(mm.getName()+" give chocolate");

	}

}
