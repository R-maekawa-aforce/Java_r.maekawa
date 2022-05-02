package jp.co.aforce.text;

public class Main {
	public static void main(String args[]) {

		/*Car car;
		car = new Car();
		*/

		Car car = new Car();

		car.speedDown(10);
		car.speedUp(250);

		System.out.println("スピード:" + car.getSpeed());

		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);

		/*int newSpeed = 80;
		car.speedUp(newSpeed);
		System.out.println("スピード:" + car.speed);
		*/
	}
}
