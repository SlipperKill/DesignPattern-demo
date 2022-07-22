/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;


public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new MysqlDepartment();
	}

}
