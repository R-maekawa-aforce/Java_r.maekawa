package jp.co.aforce.study;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		Dog dog = new Dog();

		dog.setName("ぽち");
		dog.setAge(3);


		dog.showProfile();


	Cat cat = new Cat();

		cat.getName("まる");
		cat.getAge(2);

		cat.showProfile();

		ArrayList<Animal>speaks = new ArrayList<>();
		speaks.add(new Animal());
		speaks.add(new Dog());
		speaks.add(new Cat());


		for(Animal speak : speaks) {
		System.out.println(speak.getSpeak());
		}


	}
}
