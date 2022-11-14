package test.ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for (int score : scores) { // 00 : 배열명 -> 알아서 하나씩 00에 값을 할당해줌. (score에 scores의 값을 하나씩 할당해주는 것) 
			System.out.println(score); // scores 배열의 값을 하나씩 씀. 
			sum  += score;
		}

		System.out.println(sum);
		
		
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		// 배열 복사 -> 배열의 크기 늘려줌 
//		for (int i = 0; i<oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i]; // newIntArray에 oldIntArray를 넣어줌 
//		}
		
		// 배열 복사는 제공해주는 메소드가 있답니다~! 결과는 똑같이 출력됨! 
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		// System.arraycopy(원본 배열, 원본배열 복사 시작 인덱스, 새 배열, 새 배열 붙여넣기 하고 싶은 인덱스, 복사 항목 수)
		// 원본 배열 0번부터 복사를 해서 newIntArray에 복사... 한다! 복사 항목 수 = oldIntArray 원본 배열에서 3개 다 가져온다고~ 
		
		for (int i = 0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", "); // 나머지는 0으로 출력 
		}
		
		
		/*
		String[] strArray = new String[3];
		strArray[0] = "java"; // 10번지
		strArray[1] = "java"; // 10번지
		strArray[2] = new String("java"); // 30번지 

		System.out.println(strArray[0] == strArray[1]); // 리터럴 문자열(힙)이 같기 때문에 동일한 주소 (실제 데이터는 같은 주소의 힙 "java")
		System.out.println(strArray[0] == strArray[2]); // 주소가 같지 않으니까 false가 나옴. 
		System.out.println(strArray[0].equals(strArray[2])); // eqauls는 순수하게 값을 비교하는거니까 리터럴 문자열이 같아서 true.
		*/
		
		/*
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2; // arr2의 데이터를 넘겨주는게 아니라 주소를 넘겨주는 것. 
		
		System.out.println(arr1 == arr2); // 배열은 참조타입이기 때문에 arr1, arr2, arr3는 각각 주소가 다르당!(각각의 스택) (실제 데이터는 힙에 있음)
		// 값을 비교하는게 아니라 주소를 비교하는 것이기 때문에 false가 나옴. 
		System.out.println(arr2 == arr3);
		
		int[] intArray = null; // null: 값이 없다는 의미. 자바스크립트랑 똑같당. 
		intArray[0] = 10; 
		System.out.println(intArray); // 에러 뜸! >> Cannot store to int array because "intArray" is null
		*/
		
	}

}
