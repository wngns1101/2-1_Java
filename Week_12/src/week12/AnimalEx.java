package week12;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------");

		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		
		if(animal instanceof Dog) {
			System.out.println("dog ��ü�� ��ȯ ����");
			Dog dog = (Dog)animal;
			dog.dogLife();
		} else {
			System.out.println("Cat ��ü�� ��ȯ ����");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
		System.out.println("=================");
	}
}
