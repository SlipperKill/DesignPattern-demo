/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;


public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
