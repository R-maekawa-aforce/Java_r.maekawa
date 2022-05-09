package jp.co.aforce.text;

public class Car {
	private int speed;
	private String owner;

	void setOwner(String owner) {
		this.owner = owner;
	}

	Car(){
		this.speed = 10;
	}

	Car(int speed){
		this.speed = speed;
	}

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
		String getCarType() {
			return "自動車";
		}

		int getSokudo() {
			return 60;
		}

}