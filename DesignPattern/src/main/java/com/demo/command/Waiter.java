/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.command;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Waiter {

	private List<Command> orders = new ArrayList<Command>();

	public void setOrder(Command command) {
		orders.add(command);
		System.out.println("增加订单：" + command.toString() + " 时间：" + Calendar.getInstance().getTime().toString());
	}

	public void cancelOrder(Command command) {
		orders.remove(command);
		System.out.println("撤销订单：" + command.toString() + " 时间： " + Calendar.getInstance().toString());
	}

	public void excute() {
		for (Command cmd : orders) {
			cmd.excuteCommand();
		}
	}
}
