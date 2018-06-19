package day4;

public class ArrayLab2 {
	public static void main(String[] args) {
		char jv[]={'J','a','v','a'};
		System.out.print("변환된 배열: ");
		for (int i = 0; i < jv.length; i++) {
			if (65 <= jv[i] && jv[i] <= 90) {//('A' <= jv[i] && jv[i] <= 'Z')로 써도 가능함
				jv[i] += 32; //jv[i]=(char)jv[i]+32
			} else if (122 >= jv[i] && jv[i] >= 97) {//('z'>= jv[i] && jv[i] >= 'a') 
				jv[i] -= 32;
			}
			{
				System.out.print(jv[i]);
				if(i!=jv.length-1)System.out.print(",");
			}
		}
	}

}
