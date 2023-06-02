package testing_ground;

public class RecordTest {
	record Employee(String name, int age) {
		static int defaultAge = 20;
		
		public Employee {
			name = name.trim();
			
			int i = name.indexOf(',');
			int j = name.lastIndexOf(',');
			if(i !=j) throw
				new IllegalArgumentException("Обнаружено несколько запятых.");
			
			if(i < 1 | name.length() == i+1) throw
			new IllegalArgumentException("Требуемый формат name: фамилияб имя");
		}
		public Employee(String name) {
			this(name, defaultAge);
		}
		String lastName() {
			return  name.substring(0, name.trim().indexOf(','));
		}
	}
	public static void test() {
		Employee emp = new Employee("Jones, Robert");
		System.out.println(emp.age());
	}
}
