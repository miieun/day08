package quiz_1;

import java.util.Scanner;

public class MainQuiz03 {
public static void main(String[] args) {
	System.out.println("---array 이용---");
	TestQuiz03 t= new TestQuiz03();
	int[]arr = t.myInput();
	int result=t.op(arr);
	t.print(result, arr[0], arr[1]);
}
}
