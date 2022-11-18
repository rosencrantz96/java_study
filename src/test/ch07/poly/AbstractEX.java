package test.ch07.poly;

public class AbstractEX {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		// 매개변수 다형성 
		animalSound(dog);
		animalSound(cat);
	}

	// 1. 다형성을 하려면 일단 메소드가 있어야 함
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
