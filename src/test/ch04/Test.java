package test.ch04;

import java.util.PrimitiveIterator.OfDouble;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a';
		
		if (ch != ' ' && ch != '\t') {
			System.out.println(ch);
		}
		
		char ch1 = 'X';
		if (ch1 == 'x' || ch1 == 'X') {
			System.out.println(ch1);
		}
		
		char ch2 = '9';
		if (ch2 <= 9 || ch2 >= 0) {
			System.out.println(ch2);
		}
		
		
	}

}
