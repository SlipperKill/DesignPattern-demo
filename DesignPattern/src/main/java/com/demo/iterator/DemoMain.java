/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.iterator;

/**
 * @Title 
 * 迭代器模式
 * @Description 
 * 提供一种方式顺序访问一个聚合对象中各个元素，而不暴露该对象的内部表示
 * 为遍历不同的聚集结构提供如：开始、下一个、是否结束、当前哪一项等统一的接口
 * Iterator 就是迭代器模式
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {
		ConcreteAggreaget aggreaget = new ConcreteAggreaget();
		aggreaget.set(0, "张三");
		aggreaget.set(1, "李四");
		aggreaget.set(2, "王五");
		aggreaget.set(3, "赵六");

		Iterator<String> i = new ConcreteIterator(aggreaget);
		while (!i.isDone()) {
			System.out.println(i.currentItem() + " 请买车票～");
			i.next();
		}
	}

}
