package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		Properties props = System.getProperties();
		Set Keys = props.keySet();
		
		for(Object objkey: Keys) {
			String key = (String) objkey; // 강제형변환 (String으로)
//			System.out.println(key); // 사용 가능한 키를 전부 출력해준다. 
//			System.out.println(System.getProperty("user.home")); // 사용 가능한 키를 전부 출력해준다. 
			System.out.println(System.getProperty(key)); 
		}
	}

}
