package day7;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0);// bonus=0; 안해줘도 사실 int기본값은 0이 넣어져있음
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
		int salary;
		if (grade == 1)
			salary = bonus + 100;
		else if (grade == 2)
			salary = bonus + 90;
		else if (grade == 3)
			salary = bonus + 80;
		else
			salary = bonus + 70;
		return salary;
	}

}

public class SalaryExam {

	public static void main(String[] args) {

		int month = day5.MethodLab3.getRandom(12);
		int grade = day5.MethodLab3.getRandom(4);

		SalaryExpr e1; // 객체 선언을 반복문 위에 해서 출력문을 밖으로 뺄 수 있게함
		if (month % 2 == 0) {
			e1 = new SalaryExpr(100);
		} else {
			e1 = new SalaryExpr();
		}
		System.out.printf("%d월 %d등급의 월급은 %d입니다.", month, grade, e1.getSalary(grade));
	}

}
