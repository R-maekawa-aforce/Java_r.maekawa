package jp.co.aforce.text;

public class Person {

	private String name;
	private static int count = 0;

	void setName(String name) {
		this.name = name;
	}

	static void setCount(int count) {
		Person.count = count;
	}
}
