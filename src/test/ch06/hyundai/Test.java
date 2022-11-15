package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Test {
	// 다른 패키지에 있는 클래스를 사용하고 싶으면 import 해줘야 함 (자동완성이라 알아서 됨)
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	Test test = new Test(); // 얘는 임포트 하라고안 뜸
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire(); // 임포트 안 쓰면 이렇게 하면 되는데... 드러워서 잘 안 씀 
}
