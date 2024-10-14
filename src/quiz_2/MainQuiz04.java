package quiz_2;

import java.util.Scanner;

class Prime{
	public int primeCheck(int n1) {
		int cnt=0;
		for(int i=1;i<=n1;i++)
			if(n1%i==0)cnt++;
		return cnt;
	}
	public void outPut(int n1, int re) {
		if(re==2)
			System.out.println(n1+"은 소수입니다");
		else
			System.out.println(n1+"은 소수가 아닙니다");
	}
}
public class MainQuiz04 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Prime prime=new Prime();
	int num1;
	System.out.println("수 입력 : ");
	num1=input.nextInt();
	int result=prime.primeCheck(num1);
	prime.outPut(num1, result);
}
}
