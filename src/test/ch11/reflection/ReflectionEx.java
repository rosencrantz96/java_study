package test.ch11.reflection;

/*
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
*/

import java.lang.reflect.*; // reflect 안에 있는 모든 패키지를 가져온다

public class ReflectionEx {

	public static void main(String[] args) {
		// 클래스 정보를 얻기 위해서는 클래스 객체를 만들어야 한다! 
		Class clazz = Car2.class; // Car 객체 
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			// 파라미터의 타입을 불러온다. (배열로 받음. 여러개를 받을 가능성도 있기 때문에!) 
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.print(field.getType().getName() + " "+ field.getName());
		}
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			// 파라미터의 타입을 불러온다. (배열로 받음. 여러개를 받을 가능성도 있기 때문에!) 
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for (int i=0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i<(parameters.length-1)) { // 맨 뒤 요소에도 , 가 붙으면 안되니까 -1
				System.out.print(", "); // 매개변수 사이에 콤마를 찍는다. 
			}
		}
	}

}
