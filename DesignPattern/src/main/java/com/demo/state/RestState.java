/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.state;

public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 21) {
			System.out.println("now is " + w.getHour() + " ,resting");
		}
	}

}
