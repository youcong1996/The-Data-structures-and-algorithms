package cn.pre.example;
/**
 * 基本类型包装类
 * @author youcong
 * @date 2018年12月25日20点19分
 */
public class WrapperDemo {

	
	public static void main(String[] args) {
		
		MemoryCell m = new MemoryCell();
		m.write(new Integer(37));
		Integer wrapperVal = (Integer) m.rend();
		int val = wrapperVal.intValue();
		System.out.println("Contents are:"+val);
	
	}
	
}
