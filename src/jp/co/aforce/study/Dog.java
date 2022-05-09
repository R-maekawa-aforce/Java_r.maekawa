package jp.co.aforce.study;

public class Dog extends Animal {

	private String name;
	private int age;

	String setName(String name) {
		return this.name = name;
	}

	int setAge(int age) {
		return this.age = age;
	}

	void showProfile() {
		System.out.println(this.name + ":" + this.age);
	}

	@Override
	String getSpeak() {
		return "わんわん";
	}

}
