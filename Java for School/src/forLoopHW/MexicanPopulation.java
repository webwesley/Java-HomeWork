package forLoopHW;

public class MexicanPopulation {

	public static void main(String[] args){
		int counter = 0;
		for(double pop = 111.2; pop <= 120; pop *=1.0113){
			counter++;
		}
		System.out.print("It will take " + counter + " years for the population of Mexico to reach 120 million");
	}
}
