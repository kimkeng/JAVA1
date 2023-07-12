package sec03.exam04;

public class SoundableExample {

		private static void printSound(Soundable soundable) {
			soundable.sound();
		}
		
		public static void main(String[] args) {
			printSound(new Cat());
			printSound(new Dog());
		}
	}