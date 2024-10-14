package quiz_2;

import java.util.Scanner;

class Absolute{
	public int absoluteCheck(int n1) {
		if(n1<0)return -n1;
		else return n1;
	}
	public void outPut(int n1,int re) {
		System.out.println(n1+"의 절대값은 : "+re+" 입니다.");
	}
}
public class MainQuiz05 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Absolute absolute=new Absolute();
	int num1;
	System.out.print("수 입력 : ");
	num1=input.nextInt();
	int result=absolute.absoluteCheck(num1);
	absolute.outPut(num1, result);
}
}
