package CollectionFwork;

import java.util.Stack;

public class StackAssi {

	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push("D");
		s.push("C");
		s.push("B");
		s.push("E");
		s.push("A");
		
		System.out.println("My priorities : ");
		while (!s.isEmpty()) {
			String nextPriority = (String) s.pop();
			System.out.println(" "+ nextPriority);
			
		}

	}

}
