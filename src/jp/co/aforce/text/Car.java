package jp.co.aforce.text;

public class Car {
	private int speed;

	int getSpeed(){
		return this.speed;
	}

	void speedDown(int value) {
		if(value < 0) {
			return;
		}

		this.speed -= value;

		if(this.speed <= 0) {
			this.speed = 0;
		}
	}
	void speedUp(int value) {
		if(value < 0) {
			return;
		}

		this.speed += value;

		if(this.speed > 180) {
			this.speed = 180;
		}
	}
}