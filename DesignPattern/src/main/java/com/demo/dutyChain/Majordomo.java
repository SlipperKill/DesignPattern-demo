/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.dutyChain;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if (request.getRequestType() == Request.REQUEST_TYPE_LEAVE && request.getNumber() < 6) {
			System.out.println(name + "批准" + request.getRequestContent() + ",数量：" + request.getNumber());
		} else {
			if (superior != null) {
				superior.requestApplications(request);
			}
		}
	}

}
