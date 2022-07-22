/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;


public class SqlServerUser implements IUser {

	@Override
	public void insertUser(User user) {
		System.out.println("this is sqlserver insert user");
	}

}
