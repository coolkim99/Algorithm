import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B17299 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] nums = new int[num];//수열 배열
		int[] result = new int[num];//결과 배열
		int[] counts = new int[1000001];
		
		//스택에 수열 저장
		String[] input = bf.readLine().split(" ");
		
		//nums배열에 수열 저장 & 수열에 나온 빈도 저장
		for(int i = 0; i<num; i++) {
			nums[i] = Integer.parseInt(input[i]);
			counts[nums[i]] += 1;
		}
		
		//처음인덱스 넣기
		stack.push(0);
		
		//1부터 끝까지 반복
		for(int i=0; i<num;i++) {
			//스택이 비어있으면
			if(stack.isEmpty()) {
				stack.push(i);
			}
			
			while(!stack.isEmpty() && counts[nums[i]]>counts[nums[stack.peek()]]) {
				result[stack.pop()] = nums[i];
			}
			//반복문 끝나면 다음에 비교할 값 stack에 입력
			stack.push(i);
		}
		
		//스택이 비었으면 result에 -1 넣기
		while(!stack.isEmpty())
			result[stack.pop()] = -1;
		
		//결과 출력
		for(int i = 0; i< num; i++)
			bw.write(result[i]+" ");
		
		bw.flush();
		return;
		
	}

}
