import java.util.Scanner;

public class B11651 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mul = 1;
		for(int i = 1; i< n+1; i++) {
			mul = mul * i;
		}
		System.out.println(mul);
	}

}
