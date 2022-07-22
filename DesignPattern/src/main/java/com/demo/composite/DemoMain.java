/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.composite;

/**
 * 
 * @Title 
 * 组合模式
 * @Description 
 * 将对象组合成树行结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("北京总公司");
		root.add(new HRDepartment("北京总公司人力资源部"));
		root.add(new FinanceDepartment("北京总公司财务部"));
		
		ConcreteCompany comp = new ConcreteCompany("南京分公司");
		comp.add(new HRDepartment("南京分公司人力资源部"));
		comp.add(new FinanceDepartment("南京分公司财务部"));
		
		root.add(comp);
		
		ConcreteCompany comp2 = new ConcreteCompany("长沙分公司");
		comp2.add(new HRDepartment("长沙分公司人力资源部"));
		comp2.add(new FinanceDepartment("长沙分公司财务部"));
		
		root.add(comp2);
		
		System.out.println("组织架构：");
		root.display(1);
		System.out.println("职责：");
		root.lineOfDuty();
	}

}

