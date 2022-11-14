package test.ch03;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부호 연산자 
		/*
		int x = -100;
		x = - x;
		System.out.println(x);
		*/
		
		int x = 10;
		int y = 10;
		int z;
		
		
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("-----------------------");
		
		y--;
		--y;
		System.out.println("y=" + y);
		System.out.println("-----------------------");
		
		z = x++; // 후위 연산자는 대입을 대입을 먼저 한다! (z에 x값을 먼저 대입)
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("-----------------------");
		
		z = ++x; // 전위 연산자는 증가 시킨 후 대입을 한다. (z에 증가를 먼저 시킨 후 x값을 대입)
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("-----------------------");
		
		z = ++x + y++;
		System.out.println("z= " + z); // 23 (15(14)+8)
		System.out.println("x= " + x); // 15
		System.out.println("y= " + y); // 9
		System.out.println("-----------------------");
		
		
		
	}

}
