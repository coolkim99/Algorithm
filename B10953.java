import java.util.Scanner;

public class B10953 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n-->0) {
			String[] num = sc.next().split(",");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			System.out.println(a+b);
		}
	}

}
