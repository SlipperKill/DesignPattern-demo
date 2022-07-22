/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.builder;

/**
 * 
 * @Title 
 * 建造者模式
 * @Description 
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		Director director = new Director();
		
		Builder builderA = new BuilderA();
		director.construct(builderA);
		Product a = builderA.getProduct();
		a.show();
		
		
		Builder builderB = new BuilderB();
		director.construct(builderB);
		Product b = builderB.getProduct();
		b.show();
	}

}

