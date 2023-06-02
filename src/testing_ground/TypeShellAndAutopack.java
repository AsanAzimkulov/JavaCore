package testing_ground;

public class TypeShellAndAutopack {
	public static void runDemo() {
		Character chShell = Character.valueOf('c');
		String strShell = String.valueOf("jfdkjfkd");
		
		Integer intShell = Integer.valueOf(333);
		Boolean boolShell = Boolean.valueOf("TRUE");
		
		System.out.println("Значение Integer.intValue(): " + intShell.intValue());
		
		
//		Autopack
		
		Integer i = m(100);
//	int -> Integer -> int -> Integer
		
		if(boolShell) System.out.println(boolShell);
		
	}
	
	private static int m(Integer v) {
		return v;
	}
}
