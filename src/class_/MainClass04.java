package class_;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t=new TestClass04();
		int num=t.myInput();
		if(num%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

		//System.out.println("수 입력");
		//input.nextInt();
		num=t.myInput();//위에 두 식 합한것
		if(num%3==0)
			System.out.println("3배수");
		else
			System.out.println("3배수 아님");
	}
}
