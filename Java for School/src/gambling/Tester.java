package gambling;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int median = 0;
		String bob = "";
		Dice dice = new Dice();

		for (int i = 1; i <= 100; i++) {
			dice.roll();
			total += dice.getSum();
			bob += Integer.toString(dice.getSum()) + ",";
			if (i == 50 || i == 51) {
				median += dice.getSum();
			}
		}
		int sum = 0;
		int tmp = 0;
		int mode = 0;
		for (int i = 2; i <= 12; i++) {
			for (int j = 0; j < 100; j++) {
				if (bob.charAt(j) == i) {
					tmp += 1;
				}

			}
			if (tmp > sum) {
				sum = tmp;
				mode = i;
			}
		}

		System.out.println("Median:" + median / 2);
		System.out.println("Mean:" + total / 100);
		System.out.println("Mode:" + mode);
	}

}
