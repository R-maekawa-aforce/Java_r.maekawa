package jp.co.aforce.study;

import java.util.ArrayList;

public class Main {
	private static final double TAX = 0.1;

	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER
	};

	public static void main(String args[]) {

		int product = (int) (1500 * (1 + TAX));

		System.out.println(product + "円");

		for (Season season : Season.values()) {
			System.out.println(season);
		}

		Dog dog = new Dog();
		Cat cat = new Cat();
		Mail mail = new Mail();


		dog.setName("ぽち");
		dog.setAge(3);
		dog.showProfile();


		cat.getName("まる");
		cat.getAge(2);

		cat.showProfile();

		ArrayList<Animal> speaks = new ArrayList<>();
		speaks.add(new Animal());
		speaks.add(new Dog());
		speaks.add(new Cat());

		for (Animal speak : speaks) {
			System.out.println(speak.getSpeak());
		}

		mail.sendMail("打合せ", "13時から打ち合わせです", "r.maekawa");
		mail.sendMail("１４時から打ち合わせです", "r.maekaaw");


		ArrayList<String>numbers = new ArrayList<>();
		numbers.add("りんご");
		numbers.add("ブドウ");








	}
}
