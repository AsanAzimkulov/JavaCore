package testing_ground;

public class Stack implements IntStack{
	int[] stack;
	int tos;
	
	Stack(int size) {
		tos = -1;
		stack = new int[size];
	}
	
	public void push(int item) {
		if(tos == stack.length - 1) 
			System.out.println("Стек полон");
		else
			stack[++tos] = item;
	}
	
	public int pop() {
		if(tos < 0) {
			System.out.println("Стек пуст");
			return 0;
		}
		else
			return stack[tos--];
	}
}
