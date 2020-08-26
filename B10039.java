import java.util.Scanner;

public class B10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int n = sc.nextInt();
			score[i] = n;
			if(n<40)
				score[i] = 40;
		}
		
		for(int i=0; i<5; i++) {
			sum = sum + score[i];
		}
		int average = sum/5;
		
		System.out.println(average);
	}

}
