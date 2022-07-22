/**
 * Created on 2018年4月9日 by caiming
 */
package com.demo.memento;

/**
 * 
 * @Title
 * 备忘录模式 
 * @Description 
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态
 * 備忘錄模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类
 * 如果在某个系统中使用命令模式时，需要实现命令的撤销功能，那么命令模式可以使用备忘录模式来存储可撤销的操作的状态
 * @author caiming
 * @version 1.0
 * @修改记录
 * @修改序号，修改日期，修改人，修改内容
 */
public class DemoMain {

	public static void main(String[] args) {

		System.out.println("player init...");
		Player player = new Player();
		player.getInitState();
		player.display();

		System.out.println("player memento...");
		PlayerStateCaretaker stateAdmin = new PlayerStateCaretaker();
		stateAdmin.setMemento(player.saveState());

		System.out.println("player fight and dead..");
		player.dead();
		player.display();

		System.out.println("player recover...");
		player.recoverState(stateAdmin.getMemento());
		player.display();
	}

}
