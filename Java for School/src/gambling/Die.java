package gambling;

public class Die {

	private String color;
	private int value;	
	
	public Die(){
		this.color = "White";
		this.value = 6;
	}
	
	public Die(String color, int value){
		this.color = color;
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int roll(){
		return (int)((Math.random() * 6) + 1);
	}
	
	
	
	
}
