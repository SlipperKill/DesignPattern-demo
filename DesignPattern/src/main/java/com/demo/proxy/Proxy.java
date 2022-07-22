/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.proxy;

public class Proxy implements IGiveGift {

	Pursuit gg;

	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}

	@Override
	public void giveDolls() {
		gg.giveDolls();

	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();

	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();

	}

}
