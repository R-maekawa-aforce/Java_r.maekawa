package jp.co.aforce.text;

public class Car {
	protected int speed;
	private String owner;
	private Engine engine;
	private String name = "本体";
	private static final int MAX_SPEED = 180;

	void setOwner(String owner) {
		this.owner = owner;
	}

	/*Car(){
		this.speed = 10;
	}*/

//		Car(int speed){
//			this.speed = speed;
//		}

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

			if(this.speed > MAX_SPEED) {
				this.speed = MAX_SPEED;
			}
		}
			String getCarType() {
				return "自動車";
			}

			int getSokudo() {
				return 60;
	 		}


		void lock(Key key) {
			System.out.println("鍵でロックしました");
		}

		void lock(RemoteController controller) {
			System.out.println("リモコンでロックしました");
		}

		final void initialize() {
			this.speed = 0;
		}



		class Engine{
					void start() {
							System.out.println("エンジンスタート");
					}
			private String name = "エンジン";

			void check() {
				System.out.println(this.name);
				System.out.println(Car.this.name);
			}
		}
		Car(){
			this.engine = new Engine();
		}
		void start() {
			this.engine.start();
			System.out.println("発射できます");
		}


}