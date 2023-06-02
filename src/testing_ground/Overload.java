package testing_ground;

public class Overload {
	public static void method(int ...args) {
		System.out.println(args.length);
	}
	public static void method() {
		System.out.println("none");
	}
}
