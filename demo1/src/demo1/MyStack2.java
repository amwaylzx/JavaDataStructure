package demo1;
/**
 * 栈
 * @author admin
 *
 */
public class MyStack2 {

	private Object[] elementData;////存储元素的数组,声明为Object类型能存储任意类型的数据
	private int Size; //长度/容量
	private int top; //当前房间号/指向栈顶的指针
	
	
	public  MyStack2(int size) {
		this.elementData = new Object[10];
		size = 10;
		top = -1;
	}
	
	
}
