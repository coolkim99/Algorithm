import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1158 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Queue<Integer> jo = new LinkedList<Integer>();
		Queue<Integer> jos = new LinkedList<Integer>();
		int m = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			jo.offer(i+1);
		}
		int count = 1;
		
		while(!jo.isEmpty()) {
			if(count%m == 0) {
				jos.offer(jo.poll());
			}
			if(count%m!=0) {
				jo.offer(jo.poll());
			}
			count++;
		}
		System.out.print("<"+jos.poll());
		while(!jos.isEmpty()) {
			System.out.print(", "+jos.poll());
		}
		System.out.print(">");

	}

}
