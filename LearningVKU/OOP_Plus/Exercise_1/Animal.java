package Exercise_1;

public class Animal {
	public void makeSound() {
		System.out.println("Animal make a sound");
	}
}
	public class Dog extends Animal{
		@Override
		public void makeSound() {
			System.out.println("Dog make a sound");
		}
	}
	
	

