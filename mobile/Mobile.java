package mobile;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public abstract void operate(int time);
	public abstract void charge(int time);
	

	public String getMobileName() {//부모에 있는 변수가private이니까 변형을 못해! 그래서 get이 가져오는거고 set이 설정하는 것
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

}
