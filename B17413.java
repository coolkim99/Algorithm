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
			
			//<>안의 토큰 처리
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
				//공백일 때
				if(now.equals(" ")) {
					while(!temp.isEmpty()) {
						sb.append(temp.pop());
					}
					sb.append(" ");
					continue;
				}
				//마지막 문자일 경우
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
