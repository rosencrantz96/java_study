package test.ch14.verctor;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<>(); // 자동형변환(Queue는 인터페이스)
		
		// Queue는 먼저 들어온 것이 먼저 나감 
		
		// 메세지 넣기 
		msgQ.offer(new Message("sendMain", "강이지")); // 객체 자체를 Queue에 넣어주는 것 
		msgQ.offer(new Message("sendSMS", "김춘배"));
		msgQ.offer(new Message("sendKakao", "김나비"));
		
		// 메세지 내보내기
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
	}

}
