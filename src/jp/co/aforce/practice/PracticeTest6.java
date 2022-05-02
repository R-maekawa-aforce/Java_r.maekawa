package jp.co.aforce.practice;

public class PracticeTest6 {

	public static void main(String[] args) {
		//練習問題１
		int fortune = new java.util.Random().nextInt(9);

		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;

		case 2:
			System.out.println("中吉です");
			break;

		case 3:
			System.out.println("大吉です");
			break;

		default:
			System.out.println("凶です");
			break;
		}

		//練習問題２
		int sum = 0;
	for(int i = 1;i < 100;i++) {
		if(i%7 == 0) {
			System.out.println(i);
			sum += i;
		}
	}
	System.out.println("７の倍数の総合計は"+ sum);

		//練習問題３

	for(int i = 1;i <= 9;i++) {
		for(int j = 1;j <= 9;j++) {
			int k = i * j;
			System.out.printf("%5d",k);
		}
		System.out.println();

	}



	}


}
