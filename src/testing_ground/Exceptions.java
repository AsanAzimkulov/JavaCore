package testing_ground;

class MyException extends Exception{
	String detail;
	
	MyException(String d){
		detail = d;
	}
	
	MyException(String d, Throwable causeExc){
		super(d, causeExc);
		
		detail = d;
	}
	
	public String toString() {
		return "Custom exception: " + detail;
		
	}
}

public class Exceptions {
	public static void method(){
		try {
			throw new MyException("404", new ArithmeticException("Математическая ошибка при парсинге url-параметров"));
		}
		catch(MyException | ArithmeticException ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}
}
