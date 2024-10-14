package quiz_1;

import java.util.HashMap;

public class MainQuiz05 {
public static void main(String[] args) {
	TestQuiz05 t=new TestQuiz05();
	HashMap<String, Integer>map=t.myInput();
	map=t.op(map);
	t.print(map);
		
		
	}
}