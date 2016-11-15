package gambling;

public class Dice {

	//creates a set of die
	
	private int sum;
	private Die dieA;
	private Die dieB;
	
	public Dice(){
		this.sum = 0;
		this.dieA = new Die();
		this.dieB = new Die();
	}
	
	public int roll(){
		sum = dieA.roll() + dieB.roll();
		return sum;
	}

	public int getSum() {
		return sum;
	}

	
}
