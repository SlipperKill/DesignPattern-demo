/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.mediator;

public class UnitedNationsSecurityCouncil extends UnitedNations {

	private USA colleague1;

	private Iraq colleague2;

	public USA getColleague1() {
		return colleague1;
	}

	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}

	public Iraq getColleague2() {
		return colleague2;
	}

	public void setColleague2(Iraq colleague2) {
		this.colleague2 = colleague2;
	}

	@Override
	public void declare(String message, Country colleague) {
		if (colleague == colleague1) {
			colleague2.getMessage(message);
		} else {
			colleague1.getMessage(message);
		}
	}

}
