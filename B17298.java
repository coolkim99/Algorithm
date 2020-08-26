import java.io.*;
import java.util.Stack;

public class B17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] nums = new int[num];
		int[] result = new int[num];
		String[] input = bf.readLine().split(" ");
		
		for(int i = 0; i<num; i++)
			nums[i] = Integer.parseInt(input[i]);
		
		stack.push(0);
		
		for(int i=0; i<num;i++) {
			while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
				result[stack.pop()] = nums[i];
			stack.push(i);
		}
		
		while(!stack.isEmpty())
			result[stack.pop()] = -1;
		
		for(int i = 0; i< num; i++)
			bw.write(result[i]+" ");
		
		bw.flush();
		return;
	}

}
