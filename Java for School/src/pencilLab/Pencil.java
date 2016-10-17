package pencilLab;

public class Pencil {

	private String color;
	private boolean isSharp; 
	private int condition;
	
	//constructers 
	public Pencil(){
		this.color = "yellow";
		this.isSharp = true;
		this.condition = 5;
	}
	
	public Pencil(String color, boolean isSharp){
		this.color = color;
		this.isSharp = isSharp;
	}
//getters and setters for each varaible
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSharp() {
		return isSharp;
	}

	public void setSharp(boolean isSharp) {
		this.isSharp = isSharp;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	} 
	//checks to see if the pencil is sharp. If it is, then the pencil is set to not sharp
	public void write(){
		if(this.isSharp == true){
			this.isSharp = false;
		} else {
			System.out.println("I'm sorry, we can not permit you to write with your pencil at the moment");
		}
	}
	// Will decrease the condition by one and sharpen it
	public void sharpen(){
		if(this.condition > 0){
			this.condition -= 1;
			this.isSharp = true;
		} else {
			System.out.println("I'm Sorry, your pencil no longer exists");
		}
	}
	// prints out inform
	public void infoSharp() {
		if(this.condition > 0 ){
			System.out.println("Does the " + this.color + " need to be sharpened? " + this.isSharp);
		} else {
			System.out.println("I'm Sorry, your pencil no longer exists");
		}
	}
}
