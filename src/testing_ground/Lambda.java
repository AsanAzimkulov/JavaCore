package testing_ground;

public class Lambda {
	public static void test() {
		interface NumericTest<T>{
			boolean test(T a);
		}

		
		NumericTest<Integer> isEven = a -> (a % 2) == 0;
		System.out.println(isEven.test(2));
		
		NumericTest<Integer> isNegative = a -> a < 0;
		System.out.println(isNegative.test(0));
		
		interface BlockTest{
			void test();
		}
		int num = 10;
		
		BlockTest block = () -> {
			int numPlusOne = num + 1;
		};
		
		class TestMethodLink{
			public static void m() {};
		}
		
		
		
		class TestClass {
			private int val;
			
			TestClass(int v){ val = v; };
			TestClass(){ val = 0;};
			
			int getVal() { return val; };
		}
		
		interface TestClassCon {
			TestClass func(int n);
		}
		
		TestClassCon con = TestClass::new;
		
		TestClass myClass = con.func(10);
		
		System.out.println(myClass.getVal());
		
		
//		Array constructor
		interface MyArrayCreator<T> {
			T func (int n);
		}
		
		MyArrayCreator<TestClass[]> testArrCon = TestClass[]::new;
		TestClass[] testArr = testArrCon.func(2);
		System.out.println(testArr.length);
		
		
		
	}
}
