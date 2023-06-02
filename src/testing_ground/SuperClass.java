package testing_ground;

public class SuperClass {
	int i;
	
	SuperClass(int j){
		i = j;
	}
	
	SuperClass(){
		i = 1;
	}
	
	public void show(){
		System.out.println("i: " + i);
	}
}
