
//1.creat a stack and implement it using the inbuilt classes and methods.
//2.access element of stack
//// implimentation of stack

import java.util.Stack;

public class StackSolution {
	public static void main(String[] args) {
		//stack creating method
		//Stack s1 = new stack();
		Stack<Integer> s1 = new Stack<>();
		// inserting element in stack
		s1.push(10);
		s1.push(4);
		s1.push(9);
		
		System.out.println(s1);
		
		//deleting the last element
		//s1.pop();
		//s1.pop();
		System.out.println(s1);
		
		//peek operation 
		//s1.peek();
		System.out.println(s1.peek());
		
		// emtey 
		boolean status =s1.empty();
		System.out.println(status);
		
		System.out.println(s1);
		
		int indexfound = s1.search(4);
		System.out.println(indexfound);
		
		// iterator write method in stack
		//Iterator it = s1.iterator();
		//while(it.hasNext()) {
			//Object s2 = it.next();
			//System.out.print(s2);
			//		}
		System.out.println(s1.size());
		s1.sort(null);
		System.out.println(s1);
	}
}
