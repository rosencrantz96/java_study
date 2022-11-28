package studentPracticeTest.test12;

public abstract class Animal {
	void sound() {};
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		dog.sound();
		cat.sound();
	}

}
