/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;

public class DataAccess {

	private final static String packageName = "com.demo.abstractFactory";

	private final static String db = "Mysql";// or SqlServer

	public static IUser createUser() {
		String className = packageName + "." + db + "User";
		try {
			return (IUser) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static IDepartment createDepartment() {
		String className = packageName + "." + db + "Department";
		try {
			return (IDepartment) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}
