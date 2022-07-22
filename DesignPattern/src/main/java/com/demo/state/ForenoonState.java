/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.state;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("now is " + w.getHour() + ",forenoon working ");
		} else {
			w.setCurrent(new AfternoonState());
			w.writeProgram();
		}
	}

}
