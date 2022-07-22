/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.dutyChain;
public class Request {

	public final static int REQUEST_TYPE_LEAVE = 1;
	public final static int REQUEST_TYPE_RAISES = 2;

	private int requestType;

	private String requestContent;

	private int number;

	public int getRequestType() {
		return requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
