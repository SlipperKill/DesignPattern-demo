/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;

public class MysqlDepartment implements IDepartment {

	@Override
	public void createDepartment(Department dept) {
		System.out.println("this mysql insert department");

	}

}

