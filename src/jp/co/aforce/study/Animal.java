package jp.co.aforce.study;

public class Animal {

	private String name;
	private int age;

	void getName(String name){
		this.name = name;
	}

	void getAge(int age){
		this.age = age;
	}

	void showProfile() {
		System.out.println(name + ":" + age);
	}

}
