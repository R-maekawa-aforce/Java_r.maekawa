package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest5 {

	public static void main(String[] args) {
		//練習問題２
		ArrayList<String>animal = new ArrayList<>();
		animal.add("犬");
		animal.add("猫");
		animal.add("うさぎ");
		animal.add("へび");

		//練習問題３
		String favorite = "猫";

		if(animal.contains(favorite)) {
			System.out.println(favorite + "はリストに含まれています" );
		}
		else {
			System.out.println(favorite + "はリストに含まれていません");
		}

		//練習問題４
		int birthday = 11;

		switch(birthday) {
		case 1:
			System.out.println("１月：元日、成人の日");
			break;

		case 2:
			System.out.println("２月：建国記念日の日、天皇誕生日");
			break;

		case 3:
			System.out.println("３月：春分の日");
			break;

		case 4:
			System.out.println("４月：昭和の日");
			break;

		case 5:
			System.out.println("５月：憲法記念日、みどりの日、こどもの日");
			break;

		case 6:
			System.out.println("６月：（なし）");
			break;

		case 7:
			System.out.println("７月：海の日、スポーツの日");
			break;

		case 8:
			System.out.println("８月：山の日");
			break;

		case 9:
			System.out.println("９月：敬老の日、秋分の日");
			break;

		case 10:
			System.out.println("１０月：（なし）");
			break;

		case 11:
			System.out.println("１１月：文化の日、勤労感謝の日");
			break;

		case 12:
			System.out.println("１２月：（なし）");
			break;

		}

	}

}
