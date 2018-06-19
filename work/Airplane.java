package work;

public class Airplane extends Plane {
	
	public Airplane(){}
	public Airplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	public void flight(int distance){	
		setFuelSize(getFuelSize()-distance*3);	//super을 붙이려면 set,get다 붙여!	
	};
	
	

}
