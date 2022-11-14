package test.ch03;

import javax.imageio.event.IIOReadWarningListener;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pencils = 534;
		int students = 30; // 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent); // 남은 연필 수

//		int pencilsLeft = (pencils - pencilsPerStudent * 30);
		int pencilsLeft = (pencils % students);
		System.out.println(pencilsLeft);

		int value = 356;		
		System.out.println(value - value % 100);
		System.out.println(value / 100 * 100);

		


	}

}
