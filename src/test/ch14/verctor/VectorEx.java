package test.ch14.verctor;

//import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// List<Board> list2 = new Vector<Board>(); // 자동형변환
		// 이거도 Vector를 생성하는 방법 (왜냐면 List가 Vector의 상위 클래스이기 때문!!! List는 인터페이스임)
		// list2.add(null);

		// 객체를 효율적으로 관리하기 위한 프레임워크
		// <>: 제너릭, 클래스랑 인터페이스 명만 사용 가능
		Vector<Board> list = new Vector<Board>();

		Thread threadA = new Thread() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}

		};
		Thread threadB = new Thread() {

			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}

			}

		};

		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 하는 코드
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}

		int size = list.size();
		System.out.println("총 객체 수: " + size);
	}

}
