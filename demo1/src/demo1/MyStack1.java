package demo1;
/**
 * 栈
 * @author admin
 *
 */
public class MyStack1 {

	private int[] array;
	private int maxSize; //长度
	private int top; //当前房间号
	
	
	public  MyStack1(int size) {
		this.maxSize = size;
		array = new int[size];
		top = -1;
	}
	
	//压入数据
	public void push(int value) {
		if (top < maxSize-1) {
			array[++top] = value;
		}
	}
	 //弹出栈顶数据
	public int pop() {
		return array[top--];
	}
	//访问栈数据
	public int peek(){
		return array[top];
		
	}
	//判断栈是否时空的
	public boolean isEpty() {
		return (top == -1);	
	}
	
	//判断栈是否满了
	public boolean isFull() {
		return (top == maxSize-1);
	}
	public static void main(String[] args) {
		MyStack1 stack = new MyStack1(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.err.println(stack.peek());
		while (!stack.isEpty()) {
			
			System.err.println(stack.pop());
		}
	}
}
