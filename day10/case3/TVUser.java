package day10.case3;

public class TVUser {
	public static void main(String[] args) {	
		TV tv = TVFactory.getTV(args[0]);
		//프로그램 아규먼트를 주고(run configuration에서 아규먼트 samsung이나 lg입력)실행해야 오류안남
		if(tv != null) {
			tv.powerOn();
			tv.volumnUp();
			tv.volumnDown();
			tv.powerOff();
		} else {
			System.out.println("프로그램 아규먼트로 samsung 또는 lg 를 입력해 주세요..");
		}
	}
}
