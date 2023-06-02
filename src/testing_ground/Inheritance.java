package testing_ground;

public class Inheritance extends SuperClass {
	int j;
	
	Inheritance(int k){
		super.i = 3;
		j = k;
	}
	
	public void show(String msg){
		System.out.println(msg + j);
	}
}
