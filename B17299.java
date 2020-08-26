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
		
		int[] nums = new int[num];//���� �迭
		int[] result = new int[num];//��� �迭
		int[] counts = new int[1000001];
		
		//���ÿ� ���� ����
		String[] input = bf.readLine().split(" ");
		
		//nums�迭�� ���� ���� & ������ ���� �� ����
		for(int i = 0; i<num; i++) {
			nums[i] = Integer.parseInt(input[i]);
			counts[nums[i]] += 1;
		}
		
		//ó���ε��� �ֱ�
		stack.push(0);
		
		//1���� ������ �ݺ�
		for(int i=0; i<num;i++) {
			//������ ���������
			if(stack.isEmpty()) {
				stack.push(i);
			}
			
			while(!stack.isEmpty() && counts[nums[i]]>counts[nums[stack.peek()]]) {
				result[stack.pop()] = nums[i];
			}
			//�ݺ��� ������ ������ ���� �� stack�� �Է�
			stack.push(i);
		}
		
		//������ ������� result�� -1 �ֱ�
		while(!stack.isEmpty())
			result[stack.pop()] = -1;
		
		//��� ���
		for(int i = 0; i< num; i++)
			bw.write(result[i]+" ");
		
		bw.flush();
		return;
		
	}

}
