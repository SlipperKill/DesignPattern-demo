/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.command;


public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.BakeMutton();

	}
	
	public String toString(){
		return "烤羊肉串命令";
	}

}
