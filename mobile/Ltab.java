package mobile;

public class Ltab extends Mobile{
	public Ltab(){}
	public Ltab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	public void operate(int time){
		int bat=getBatterySize()-time*10;
		setBatterySize(bat);
	}
	
	public void charge(int time){
		int bat=getBatterySize()+time*10;
		setBatterySize(bat);
		
		
	}
	
	
	
	

}
