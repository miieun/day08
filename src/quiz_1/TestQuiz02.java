package quiz_1;

import java.util.Scanner;

public class TestQuiz02 {
	public String[] myInput() {
	Scanner input=new Scanner(System.in);
	String[]s=new String[3];
	for(int i=0; i<s.length;i++) {
		System.out.println(i+"번째 입력 : ");
		s[i]=input.next();
	}
	return s;
}
	public void print(String[]n) {
		System.out.println("---입력 받은 값---");
		for(int i=0;i<n.length;i++) {
			System.out.println(i+"."+n[i]);
		}
	}
}
