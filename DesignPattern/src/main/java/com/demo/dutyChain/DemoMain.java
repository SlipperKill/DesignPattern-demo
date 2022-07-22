/**
 * Created on 2018年4月24日 by caiming
 */
package com.demo.dutyChain;
/**
 * 
 * @Title 
 * 职责链模式
 * @Description 
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理为止。
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("金立");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager lisi = new GeneralManager("李四");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(lisi);
		
		Request request = new Request();
		request.setRequestContent("小菜请假");
		request.setRequestType(Request.REQUEST_TYPE_LEAVE);
		request.setNumber(1);
		jinli.requestApplications(request);
		
		Request request2 = new Request();
		request2.setRequestContent("小菜请假");
		request2.setRequestType(Request.REQUEST_TYPE_LEAVE);
		request2.setNumber(5);
		jinli.requestApplications(request2);
		
		Request request3 = new Request();
		request3.setRequestContent("小菜加薪");
		request3.setRequestType(Request.REQUEST_TYPE_RAISES);
		request3.setNumber(2000);
		jinli.requestApplications(request3);
		
		Request request4 = new Request();
		request4.setRequestContent("小菜加薪");
		request4.setRequestType(Request.REQUEST_TYPE_RAISES);
		request4.setNumber(6000);
		jinli.requestApplications(request4);
		
		Request request5 = new Request();
		request5.setRequestContent("小菜请假");
		request5.setRequestType(Request.REQUEST_TYPE_LEAVE);
		request5.setNumber(30);
		jinli.requestApplications(request5);
	}

}

