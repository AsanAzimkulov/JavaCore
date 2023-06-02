package testing_ground;

interface MyInterface{}

public class Generics<T extends Object & MyInterface> {

	public T test(T obj) {
		return obj;
	}
	
}


//class ObjectImplemented extends Object implements MyInterface{};
//
//Generics<ObjectImplemented> instance = new Generics<>();
//
//instance.test(new ObjectImplemented());
