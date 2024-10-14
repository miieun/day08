package quiz_1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz04 {
public ArrayList<Integer> myInput(){
	Scanner input=new Scanner(System.in);
	ArrayList<Integer>arr=new ArrayList<Integer>();
	System.out.println("첫번째 수 입력");
	int n1=input.nextInt();
	arr.add(n1);
	
	System.out.println("두번째 수 입력");
	arr.add(input.nextInt());
	return arr;
}
public int op(int a, int b) {
	return a+b;
}
public void print(ArrayList<Integer>arr) {
	System.out.println(arr.get(0)+"+"+arr.get(1)+"="+arr.get(2));
}
}
