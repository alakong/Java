package emp;

public class Secretary extends Employee implements Bonus {
	public Secretary(){
		
	}
	public Secretary(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	public double tax(){
		double tax=getSalary()*0.1;
		return tax;
	}
	public void incentive(int pay){
		int inc=(int)(getSalary()+0.8*pay);
		setSalary(inc);
	}
}
