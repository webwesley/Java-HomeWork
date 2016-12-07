package gambling;
import java.util.Random;


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
//		int sum = 0;
//		int tmp = 0;
//		int mode = 0;
//		for (int i = 2; i <= 12; i++) {
//			for (int j = 0; j < bob.length(); j++) {
//				int n = 0;
//				if (bob.charAt(j) != ',') {
//					String number = bob.substring(n, bob.indexOf(','));
//					String number1 = Integer.toString(i);
//					n = bob.indexOf(',');
//					if (number.equals(number1)) {
//						tmp += 1;
//					}
//				}
//			}
//			if (tmp > sum) {
//				sum = tmp;
//				mode = i;
//				tmp = 0;
//			}
//		}

//		System.out.println("Median:" + median / 2);
//		System.out.println("Mean:" + (double) total / 100);
//		System.out.println("Mode:" + mode);
		
		
			
		}
	private int randomMode(){
			Random mode = new Random();
			return(mode.nextInt(11) + 2);
	}
}
