package jp.co.aforce.text;

import java.util.ArrayList;

import jp.co.aforce.study.Mail;

/**
 * @author r.maekawa
 *
 */
public class Main {
	public static void main(String args[]) {

		Car car1 = new Car();
		System.out.println(car1.getSpeed());


		System.out.println(car1.getCarType());

		car1.speedDown(10);
		car1.speedUp(250);

		System.out.println("スピード:" + car1.getSpeed());

		Truck truck = new Truck();
		truck.addPayload(10);
		truck.speedUp(60);

		Car car2 = new Truck();
		System.out.println(car2.getCarType());

		Car car3 = new LongDriveTruck();
		System.out.println(car3.getCarType());

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car());
		cars.add(new Truck());
		cars.add(new LongDriveTruck());

		for(Car car : cars) {
			System.out.println(car.getCarType());
		}


		for(Car car : cars) {
			System.out.println(car.getSokudo());
		}


		Key key = new Key();
		car1.lock(key);


		RemoteController controller = new RemoteController();
		car1.lock(controller);

		Car car = new Truck();
		Truck truck2 = (Truck) car;

		Person person1 = new Person();
		Person person2 = new Person();

		person1.setName("中垣");
		person2.setName("林");

		Person.setCount(2);

		Mail mail = new Mail();










	}
}
