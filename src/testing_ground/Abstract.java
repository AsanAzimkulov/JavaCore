package testing_ground;

public class Abstract {
	abstract class AbstractClass {
		protected int i = 2;
		
		abstract void saySelfName();
		final void finalMethod() {};
	}
	
	class ConcreteClass extends AbstractClass {
		public void saySelfName() {
			System.out.println(i);
		}
	}
	
	class ConcreteSubclass extends ConcreteClass {
		public void saySelfName() {
			System.out.println(i);
		}
	}
	
	public void testConcrete() {
		AbstractClass concrete = new ConcreteSubclass();
		
		concrete.saySelfName();
	}
}
