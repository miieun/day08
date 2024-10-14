package quiz_2;

import java.util.Scanner;

class Multiple{
	public int multipleCheck(int n1) {
		if(n1%3==0)
			return 0;
		else
			return 1;
	}
	public void outPut(int n1, int re) {
		if(re==0)
			System.out.println(n1+"은 3의 배수입니다");
		else
			System.out.println(n1+"은 3의 배수가 아닙니다");
	}
}
public class MainQuiz03 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Multiple mul=new Multiple();
		int num1;
		System.out.println("수 입력 : ");
		num1=input.nextInt();
		int result=mul.multipleCheck(num1);
		mul.outPut(num1, result);
	}
}
