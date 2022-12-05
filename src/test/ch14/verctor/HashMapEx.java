package test.ch14.verctor;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>();
		// HashMap<key, 객체(저장할 값)>
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김하서", 85);
		map.put("김명현", 90);
		map.put("양준수", 80);
		map.put("노은비", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		// 키로 값 얻기
		String key = "김하서";
		int value = map.get(key); // key 대신에 "김하서"를 바로 집어 넣어도 ㄱㅊ음
		System.out.println("점수: " + value);
		System.out.println();
		
		// 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator(); // 반복된 키를 얻는다.
		
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		System.out.println();
		
		// 반복해서 키와 값을 얻기 두번째 방법
		/*
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Integer<Entry<String, Integer>> entryIterator = entrySet.iterator(); // 반복된 키를 얻는다. 
		
		while (entryIterator.hasNext()) { // 다음 키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); // 키를 가져옴
			Integer v = entry.getValue();
			System.out.println(k + ":" + v);
		}
		*/
	}

}
