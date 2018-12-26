package cn.generic.example;

public class BoxingDemo {

	
	public static void main(String[] args) {
		//GenericMemoryCell<Integer> m = new GenericMemoryCell<Integer>();
		
		GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
		m.write(5);
		int val = m.read();
		System.out.println("Contents are:"+val);
	}
}
