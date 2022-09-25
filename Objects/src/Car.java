
public class Car {

	String color;
	String make;
	String model;
	String bodyType;
	int year;
	
	int carState = 0; //the car is off
	double speed = 0;
	
	
	void start() {
		carState = 1; //the car is idling
	}
	
	void accelerate(double inputForce) {
		if (carState != 0) {
			carState = 2; //the car is accelerating
			speed += inputForce *2;
		}
	}
	
	void slowDown(double inputForce) {
		speed -= inputForce*2;
		if(speed <=0) {
			carState = 1;
			speed = 0;
		}
	}
	
}
