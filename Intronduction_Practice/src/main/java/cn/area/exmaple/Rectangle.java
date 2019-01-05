package cn.area.exmaple;

import java.util.Comparator;

public class Rectangle {

	private int width,height;
	private String name;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	
	public int getLength() {
		return (width+height)<<2;
	}
	
	public int getArea() {
		return width*height;
	}
	
	public String getName() {
		
		return "("+width+","+height+")";
	}
	
	public static <T>  T findMax(T[] arr,Comparator<? super T> cmp) {
		if(null == arr || cmp == null) {
			return null;
		}
		
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(cmp.compare(arr[i], arr[index])>0) {
				index = i;
			}
		}
		
		return arr[index];
	}
	/**
	 * 长度比较器
	 */
	public static class LengthCompare implements Comparator<Rectangle>{

		public int compare(Rectangle o1, Rectangle o2) {
			
			if(o1.getLength() > o2.getLength()) {
				return 1;
			}else if(o1.getLength() == o2.getLength()) {
				return 0;
			}else {
				return -1;
			}
		
		}
		
	}
	
	/**
	 * 面积比较器
	 */
	public static class AreaCompare implements Comparator<Rectangle>{

		public int compare(Rectangle o1, Rectangle o2) {
			
			if(o1.getArea() > o2.getArea()) {
				return 1;
			}else if(o1.getArea() == o2.getArea()) {
				return 0;
			}else {
				return -1;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[] {new Rectangle(5, 5),new Rectangle(3,8)};
		System.out.println(findMax(arr, new LengthCompare()).getName());
		System.out.println(findMax(arr,new AreaCompare()).getName());
	}
}
