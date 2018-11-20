package exercises;

public class LevelTwoIntermediate {

	public static void main(String[] args) {

		//System.out.println(blackJack(18, 18));

		System.out.println(uniqueSum(1, 1, 2));



	}

	public static int blackJack(int num1, int num2) {

		if(num1 > num2 && num1 <= 21) {

			return num1;

		}
		else if(num2 <= 21) {

			return num2;

		}
		else {

			return 0;

		}
	}

	public static int uniqueSum(int num1, int num2, int num3) {

		if(num1 == num2 && num1 == num3) {
			return 0;
		}
		else if(num1 == num2) {

			return num3;
		}
		else if(num1 == num3) {

			return num2;
		}
		else if(num2 == num3) {
			return num1;
		}
		else return num1 + num2 + num3;

	}

	public static boolean tooHot(int temp, boolean isSummer) {

		int upperLimit = 90;

		if(isSummer) {

			upperLimit = 100;

		}

		if(60 >= temp && temp <= upperLimit) {

			return true;

		} else {

			return false;

		}
	}

}
