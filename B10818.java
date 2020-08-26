import java.util.Arrays;
import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//정수의 개수 입력
		int n = sc.nextInt();
		int[] number = new int[n];
		
		for(int i=0; i<n; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(number);
		System.out.print(number[0] + " " + number[n-1]);
	}
}
