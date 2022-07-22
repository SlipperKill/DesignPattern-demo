/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.command;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.BakeChickenWing();
	}
	
	public String toString(){
		return "烤鸡翅命令";
	}

}
