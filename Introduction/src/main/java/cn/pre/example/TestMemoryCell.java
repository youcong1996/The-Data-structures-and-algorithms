package cn.pre.example;

import java.lang.management.MemoryNotificationInfo;

import javax.swing.event.MenuDragMouseEvent;
/**
 * 使用泛型MemoryCell类
 * @author youcong
 * @date 2018年12月25日
 */
public class TestMemoryCell {
  
	public static void main(String[] args) {
		
		MemoryCell m = new MemoryCell();
		
	    m.write("37");
	    
	    String val = (String) m.rend();
	    
	    System.out.println("Content are:"+val);
	   // System.out.println("Content are:"+m.rend().toString());
	    
	 
	}
	
}
