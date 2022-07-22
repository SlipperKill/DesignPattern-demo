/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.command;


public abstract class Command {

	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {
		this.receiver = receiver;
	}

	public abstract void excuteCommand();
}
