package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] arr ={   {'B','C','A','A'}
		                 ,{'C','C','B','B'}
		                 ,{'D','A','A','D'}
		};
		int[] num = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				num[arr[i][j] - 65]++;
			}

				/*	if(arr[i][j]=='A')
					num[0]++;
				else if(arr[i][j]=='B')
					num[1]++;
					else if(arr[i][j]=='C')
						num[2]++;
						else
							num[3]++;	
		}*/
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println((char) (i + 65) + " 는 " + num[i] + "개 입니다.");
		}

	}
	}



