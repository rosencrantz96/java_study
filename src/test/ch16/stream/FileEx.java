package test.ch16.stream;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/images"); // 파일 경로 객체 생성 
		File file1 = new File("C:/Temp/file1.txt"); // 파일 객체 생성
		File file2 = new File("C:/Temp/file2.txt"); // 파일 객체 생성
		File file3 = new File("C:/Temp/file3.txt"); // 파일 객체 생성
		
		// 디렉토리나 파일이 없으면 생성
		if(dir.exists() == false) { dir.mkdir(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) { file3.createNewFile(); }
		
		// Temp 폴더의 파일, 폴더 리스트 출력 
		File temp = new File("C:/Temp");
		File[] contents = temp.listFiles(); // 해당 폴더에 있는 파일 리스트 객체를 가져온다. 
		
		for(File file : contents) {
			if(file.isDirectory()) { // 폴더(디렉토리)인지 판단 
				System.out.println(file.getName());
			} else {
				System.out.println(file.getName());
			}
		}
	}

}
