package testing_ground;

public class Box {
	static int width;
	static int height;
	static int depth;

	static {
		System.out.println("init");
		width = getWidth();
		height = 2;
		depth = 3;
	}
	
	static int getWidth() {
		return 10;
	}
	
	static void print() {
		Inner inner = new Inner();
		inner.printInnerA();
	}
	
	static class Inner {
		int a = 0;
		
		void printInnerA() {
			System.out.println(a);
		}
	}
	
	Box(int len){
		width = height = depth = len;
	}
	
	public int getVolume() {
		return width * height * depth;
	}
}
