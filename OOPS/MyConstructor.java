class Vehicle {
	
	int wheels;
	int headLights;
	String color;
	
//	Vehicle() { //no arg constructor
//		wheels = 4;
//	}
	
//	Vehicle() {
//		wheels = 0; //default constructor, no arg passed
//	}
	
//	Vehicle(int noOfWheels) { //parameterized constructor
//		wheels = noOfWheels;
//		headLights = 2;
//	}
	
	Vehicle(int wheels) { //use of this keyword 
		this.wheels = wheels;
		headLights = 2;
	}
	
	Vehicle(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class MyConstructor {
	
	MyConstructor() {
		System.out.println("object is now created");
	}
	
	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle(4); 
		Vehicle car2 = new Vehicle(2);
		
		Vehicle eRikshaw = new Vehicle(3, "Yellow");
		
		System.out.println(car.wheels + " wheels");
		System.out.println(car2.wheels + " wheels");
		System.out.println(eRikshaw.wheels + " wheels and color = " + eRikshaw.color);

	}

}
