package cn.generic.example;

public class InstanceOfCheckExample {

	public static void main(String[] args) {
		GenericMemoryCell<Integer> celll = new GenericMemoryCell<>();
		celll.write(4);
		
		Object cell = celll;
		
		GenericMemoryCell<String> cell2 = (GenericMemoryCell<String>) cell;
		String s = cell2.read();
		
        
		

	}
	
}
