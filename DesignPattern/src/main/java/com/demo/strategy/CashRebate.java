/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.strategy;

public class CashRebate implements CashSuper {

	private double moneyRebate = 1d;

	public CashRebate(String rebate) {
		this.moneyRebate = Double.parseDouble(rebate);
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
