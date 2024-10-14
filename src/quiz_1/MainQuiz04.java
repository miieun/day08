package quiz_1;

import java.util.ArrayList;

public class MainQuiz04 {
	public static void main(String[] args) {
		TestQuiz04 t= new TestQuiz04();
		ArrayList<Integer> arr = t.myInput();
		int result=t.op(arr.get(0),arr.get(1));
		arr.add(result);
		t.print(arr);
		
	}

}
