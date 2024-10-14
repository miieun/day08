package class_;

import java.util.Scanner;

public class TestClass13 {
public String myInput() {
	Scanner input=new Scanner(System.in);
	System.out.println("이름 입력");
	String name=input.next();
	return name;
}
	public void print(String n) {
		System.out.println("입력받은 이름 : "+n);
	}
}
