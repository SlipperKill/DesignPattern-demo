/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.state;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour()<18){
			System.out.println("now is "+w.getHour()+",afternoon working");
		}else{
			w.setCurrent(new RestState());
			w.writeProgram();
		}
	}

}
