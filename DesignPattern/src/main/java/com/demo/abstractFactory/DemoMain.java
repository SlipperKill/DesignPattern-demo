/**
 * Created on 2018年4月8日 by caiming
 */
package com.demo.abstractFactory;

/**
 * 
 * @Title
 * 抽象工厂模式
 * @Description
 * 提供一个创建一系列相关或互相依赖对象的接口，而无需指定它们具体得类
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String args[]) {
		User user = new User();
		Department department = new Department();
		//調用方通過初始化sqlserver工廠或mysql工廠，就可以獲得具體的配置，实现了数据库的切换
		//IFactory factory = new SqlServerFactory();
		IFactory factory = new MysqlFactory();
		factory.createUser().insertUser(user);//此時已經與具體的數據庫訪問解除了依賴
		factory.createDepartment().createDepartment(department);
		//用反射+抽象工厂来改进数据访问程序
		DataAccess.createUser().insertUser(user);
		
		
	}

}
