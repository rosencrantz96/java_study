package test.ch14.verctor;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>(); 	

		// 동전 넣기 
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// 스택 - 먼저 넣은 것이 나중에 빠져나온다.
		
		// 동전 꺼내기
		while(!coinBox.isEmpty()) { // 스택이 비어있는지 묻는 것(비어있지 않다면 반복) 
			Coin coin = coinBox.pop(); // pop(): 가져오기
			System.out.println("꺼내온 동전: " + coin.getValue());
		}
	}

}
