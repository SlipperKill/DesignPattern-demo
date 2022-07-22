/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.dutyChain;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if (request.getRequestType() == Request.REQUEST_TYPE_LEAVE) {
			System.out.println(name + "批准" + request.getRequestContent() + ",数量：" + request.getNumber());
		}else if (request.getRequestType() == Request.REQUEST_TYPE_RAISES && request.getNumber() < 5000) {
			System.out.println(name + "批准" + request.getRequestContent() + ",数量：" + request.getNumber());
		}else if (request.getRequestType() == Request.REQUEST_TYPE_RAISES && request.getNumber() > 5000) {
			System.out.println(name + "不批准" + request.getRequestContent() + ",数量：" + request.getNumber());
		}

	}

}
