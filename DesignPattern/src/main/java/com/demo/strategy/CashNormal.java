/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.strategy;

public class CashNormal implements CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
