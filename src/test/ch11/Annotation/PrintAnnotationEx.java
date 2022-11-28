package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			// PrintAnnotation 얻기 
			PrintAnnotation printAnno = method.getAnnotation(PrintAnnotation.class); // 얻어오고 싶은 어노테이션에 대한 클래스 정보를 넣어줌...? ㅠ 먼소리여  
			
			printLine(printAnno);
			
			method.invoke(new Service()); // .invoke(): Service 객체에 있는 메소드를 차례대로 실행 
		}
	}
	
	public static void printLine(PrintAnnotation printAnno) {
		if (printAnno != null) {
			// number 속성 값 얻기 
			int number = printAnno.number(); // 내가 만들어 놓은 속성에 대한 값을 그대로 가져온다. 
			String value = printAnno.value(); // 만들어둔 value 속성 값을 가져옴 
			
			System.out.println(number);
			System.out.println(value);
		}
	}

}
