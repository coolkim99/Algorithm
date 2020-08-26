import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B17413 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		Stack<String> temp = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String now = "";
		
		for(int i = 0; i<str.length(); i++) {
			now = str.substring(i,i+1);
			
			//<>���� ��ū ó��
			if(now.contentEquals("<")) {
				if(!temp.isEmpty()) {
					while(!temp.isEmpty())
					sb.append(temp.pop());
				}
				while(true) {
					sb.append(now);
					if(now.contentEquals(">"))
						break;
					i++;
					now = str.substring(i,i+1);
				}
			}
			
			else {
				//������ ��
				if(now.equals(" ")) {
					while(!temp.isEmpty()) {
						sb.append(temp.pop());
					}
					sb.append(" ");
					continue;
				}
				//������ ������ ���
				else if(i == str.length()-1) {
					temp.push(now);
					while(!temp.isEmpty()) {
						sb.append(temp.pop());
					}
					break;
				}
				else
					temp.push(now);
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
