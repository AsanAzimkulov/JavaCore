package testing_ground;

class A {}
class B{}
class C extends A{}
class D extends A{}

public class InstanceOf {

	public static void testInstance() {

		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		if(a instanceof A) System.out.println("a - A");
		if(b instanceof B) System.out.println("b - B");
		if(c instanceof A) System.out.println("c - A");
		if(d instanceof A) System.out.println("d - A");
		
		A ob = c;
		
		if(ob instanceof A) System.out.println("ob - A");
		if(ob instanceof C) System.out.println("ob - C");
		
	}
}
