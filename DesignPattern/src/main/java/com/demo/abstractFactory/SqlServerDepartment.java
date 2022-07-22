/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void createDepartment(Department dept) {
		System.out.println("this is sqlserver insert department");
	}

}

