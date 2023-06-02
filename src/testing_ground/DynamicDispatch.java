package testing_ground;

public class DynamicDispatch {

	
	public static void main(String[] args) {
		class A {
			public void show(){
				System.out.println("A");
			}
		}
		class B extends A {
			public void show(){
				System.out.println("B");
			}
		}
		class C extends A {
			public void show(){
				System.out.println("C");
			}
		}
		
		var a = new A();
		var b = new B();
		var c = new C();
		A r;
		
		a.show();
		b.show();
		c.show();
		
		r = a;
		
		r.show();
		
		
		r= b;
		
		r.show();
		
		r = c;
		
		r.show();
		
	}
}
