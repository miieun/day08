package quiz_2;

import java.util.Scanner;

class OddEven{
	public int myInput() {
		Scanner input=new Scanner(System.in);
		System.out.print("수 입력 : ");
		return input.nextInt();
	}
	public int oddEven(int n1) {
		if(n1%2==0)return 0;
		else return 1;
	}
	public void outPut(int n1, int re) {
		if(re==0)
			System.out.println(n1+"은 짝수 입니다");
		else
			System.out.println(n1+"은 홀수 입니다");
	}
}
public class MainQuiz02 {
	public static void main(String[] args) {
		OddEven oe=new OddEven();
		int num1=oe.myInput();
		int result=oe.oddEven(num1);
		oe.outPut(num1, result);
	}

}
