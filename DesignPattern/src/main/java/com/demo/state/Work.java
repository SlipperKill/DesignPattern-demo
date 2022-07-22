/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.state;

public class Work {

	private State current;

	private double hour;

	private boolean finess = false;

	public Work() {
		current = new ForenoonState();
	}

	public void writeProgram() {
		current.writeProgram(this);
	}

	public State getCurrent() {
		return current;
	}

	public void setCurrent(State current) {
		this.current = current;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFiness() {
		return finess;
	}

	public void setFiness(boolean finess) {
		this.finess = finess;
	}

}
