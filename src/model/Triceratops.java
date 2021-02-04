package model;

public class Triceratops {
	
	//initializing variables
	private double weight;
	private String color;
	private boolean injured;
	private String injuryDescription;
	
	//constructors
	public Triceratops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triceratops(double weight, String color, boolean injured, String injuryDescription) {
		super();
		this.weight = weight;
		this.color = color;
		this.injured = injured;
		this.injuryDescription = injuryDescription;
	}
	public Triceratops(double weight, String color, boolean injured) {
		super();
		this.weight = weight;
		this.color = color;
		this.injured = injured;
	}
	public Triceratops(double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	
	//getters and setters
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isInjured() {
		return injured;
	}
	public void setInjured(boolean injured) {
		this.injured = false;
	}
	public String getInjuryDescription() {
		return injuryDescription;
	}
	public void setInjuryDescription(String injuryDescription) {
		this.injuryDescription = injuryDescription;
	}
	
	//methods
	public double injuryWeightLoss(double injury) {
		double currentWeight = this.weight;
		double newWeight = 0;
			
		newWeight = currentWeight - injury;
		
		this.weight = newWeight;
		
		return newWeight;
	}
	
	public String needDiet() {
		String message = "No";
		final double MAXWEIGHT = 12;
		
		if (this.weight > MAXWEIGHT) {
			message = "Yes, dino is chonky.";
		}
		
		return message;
		
	}

}
