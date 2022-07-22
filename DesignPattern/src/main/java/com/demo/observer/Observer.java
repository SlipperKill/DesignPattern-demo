/**
 * Created on 2018年4月3日 by caiming
 */
package com.demo.observer;
/**
 * 
 * @Title 
 * @Description 
 * 抽象觀察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public interface Observer {

	public void update();
}
