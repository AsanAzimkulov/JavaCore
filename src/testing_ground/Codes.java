package testing_ground;

public enum Codes{
	stop(1), start(2), resume();
	
	int code;
	
	Codes(int a){
		this.code = a;
	}
	
	Codes(){
		System.out.println("Вызов стандартного конструктора");
		this.code = 0;
	}
	
	public int getCode() {
		return this.code;
	}
}
