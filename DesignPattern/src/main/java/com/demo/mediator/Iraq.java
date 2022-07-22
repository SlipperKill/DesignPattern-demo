/**
 * Created on 2018年4月25日 by caiming
 */
package com.demo.mediator;
public class Iraq extends Country {

	public Iraq(UnitedNations mediator) {
		super(mediator);
	}
	
	public void declare(String message){
		mediator.declare(message, this);
	}

	public void getMessage(String message){
		System.out.println("伊拉克获得对方的消息："+message);
	}
}

