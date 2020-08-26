import java.util.Scanner;

public class B11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			int num = i+1;
			System.out.println ("Case #"+ num + ": "+ sum);
		}
	}

}
