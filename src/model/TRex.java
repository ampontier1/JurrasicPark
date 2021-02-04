package model;

public class TRex {
	
	//initializing variables
	private double weight;
	private String color;
	private boolean injured;
	private String injuryDescription;
	
	//constructors
	public TRex() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TRex(double weight, String color, boolean injured, String injuryDescription) {
		super();
		this.weight = weight;
		this.color = color;
		this.injured = injured;
		this.injuryDescription = injuryDescription;
	}
	public TRex(double weight, String color, boolean injured) {
		super();
		this.weight = weight;
		this.color = color;
		this.injured = injured;
	}
	public TRex(double weight, String color) {
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
		this.injured = injured;
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
		double newWeight;
			
		newWeight = currentWeight - injury;
		
		return newWeight;
	}
	
	public String needDiet() {
		String message = "No";
		final double MAXWEIGHT = 14;
		
		if (this.weight > MAXWEIGHT) {
			message = "Yes, put up 'Do Not Feed' sign with blood stains.";
		}
		
		return message;
	}
	
	
}
