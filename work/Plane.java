package work;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane(){}
	public Plane(String planeName, int fuelSize){
		this.planeName=planeName;
		this.fuelSize=fuelSize;
	}
	
	public abstract void flight(int distance);
	
	public void refuel(int fuel){
		this.fuelSize +=fuel;//같은 클래스내이므로 게터세터안써도 됨
	}
	
	
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	};
	

}
