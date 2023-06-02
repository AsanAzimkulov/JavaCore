package testing_ground;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str() default "Строка по-умолчанию";
	int val() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value();
}

@Repeatable(MyAnnosRepeatable.class)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoRepeatable {
	String str() default "Строка по-умолчанию";
	int val() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnosRepeatable {
	MyAnnoRepeatable[] value();
}

class Meta {

	@MyMarker
	@MySingle(233)
	@MyAnno()
	@MyAnnoRepeatable(str="first", val=1)
	@MyAnnoRepeatable(str="second", val=2)
	
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();
		
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " + anno.val());
			
			MySingle singleAnno = m.getAnnotation(MySingle.class);
			
			System.out.println(singleAnno.value());
			
//			All annotations
			
			Annotation[] annos = m.getAnnotations();
			
			int annosIndex = 0;
			
			for(var annotation : annos) {
				System.out.println(annosIndex + ": " + annotation);
				annosIndex++;
			}
			
			

			if(m.isAnnotationPresent(MyMarker.class)) {
				System.out.println("MyMarker пристутсвует");
			}
			
//			First way
			Annotation repeatableAnnosContainer = m.getAnnotation(MyAnnosRepeatable.class);
			System.out.println("Контейнер повторяющихся аннотациq: " + repeatableAnnosContainer);
			
//			Second way
			MyAnnoRepeatable[] repeatableAnnos = m.getAnnotationsByType(MyAnnoRepeatable.class);
			
			for(var repeatableAnno : repeatableAnnos) {
				System.out.println(repeatableAnno);
			}
			
		} catch(NoSuchMethodException exc) {
			System.out.println("Метод не найден");
		}
	}
	public void myMethSecond() {}
}

class SubMeta extends Meta {
	@Override
	public void myMethSecond() {}
}
