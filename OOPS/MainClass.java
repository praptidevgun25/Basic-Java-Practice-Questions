class Cat {
	
	//properties/state of cat
	boolean hasFur;
	String color, breed;
	int legs, eyes;
	
	//for behavior of cat we will have to define functions/methods
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("my cat has " + legs +" legs and " + eyes +" eyes" );
	}
	
}

class Dog {
	
	String breed, name;
	
	public void jump() {
		System.out.println("my dog " + name +" jumped");
	}
	
	public void description() {
		System.out.println("my dog's name is " +name +" and it's breed is " + breed);
	}
	
}

public class MainClass { //only one class in java is public and has same name as the file name

	public static void main(String[] args) {
		
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		
//		cat1.legs = 3;
//		cat1.eyes = 2;
//		
//		cat1.description();
//		cat2.description();
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
				
		poodle.breed = "Poodle";
		poodle.name = "Mr.Moolchand Ji";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
		

	}

}
