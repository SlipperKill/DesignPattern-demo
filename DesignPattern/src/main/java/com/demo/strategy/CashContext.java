/**
 * Created on 2018年4月2日 by caiming
 */
package com.demo.strategy;
public class CashContext {

	CashSuper cs = null;

	public CashContext(String type) {
		switch (type) {
		case "normal":
			cs = new CashNormal();
			break;

		case "rebate":
			cs = new CashRebate("0.8");
			break;
		}
	}

	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
