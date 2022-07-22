/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.template;

public abstract class TestPaper {

	public final void testQuestion() {
		System.out.println("我是选择题，你的答案是：" + answer());
	}

	public abstract String answer();
}
