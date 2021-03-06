package exercise;

public class Student extends Human {
	private String number;
	private String major;

	public Student() {
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number=number;
		this.major=major;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String printInformation() {
		return super.printInformation() +"\t" +number +"\t"+ major;//조상의 private형 멤버변수는 그냥은 호출불가 따라서 겟인포로 호출한것
	}

}
