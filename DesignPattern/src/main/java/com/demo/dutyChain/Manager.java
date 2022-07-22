/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.dutyChain;

public abstract class Manager {

	protected String name;

	protected Manager superior;

	public Manager(String name) {
		this.name = name;
	}

	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void requestApplications(Request request);

}
