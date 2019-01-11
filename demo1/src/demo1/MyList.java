package demo1;
/**
 * 数组
 * @author admin
 *
 */
public class MyList {
	//定义一个数组
	private int[] intArray;
	//定义一个数组的实际长度
	private int elems;
	//定义一个数据的最大长度
	private int length;
	
	//默认构造长度为50的构造方法
	public MyList() {
		elems = 0;
		length = 50;
		intArray = new int[length];
	}
	//构造函数，初始化一个长度为length 的数组
	public MyList(int length) {
		elems = 0;
		this.length = length;
		intArray = new int[length];
	}
	//获取数组的实际长度
	public int getSize(){
		return elems;
	}
	//便利显示元素
	public void display() {
		for (int i = 0; i < elems; i++) {
			System.out.print(intArray[i]+"");
		}
		System.out.println();
	}
	//添加元素
	//添加元素超过数组的范围返回false，成功添加返回true
	public boolean add(int value) {
		if(elems == length) {
			return false;
		}else {
			intArray[elems] = value;
			elems++;
		}
		return true;
	}
	//根据下标获取元素
	public int get(int i) {
		if(i<0 ||i>elems) {
			System.out.println("访问下标越界");
		}
		return intArray[i];
		
	}
	//查找元素 不存在返回-1
	public int find(int searchValue) {
		int i;
		for(i = 0;i<elems;i++) {
			if(intArray[i] == searchValue) {
				break;
			}
		}
		return -1;
	}
	
	//删除元素
	public boolean delete(int value) {
		int k = find(value);
		if(k == -1) {
			return false;
		}else {
			if(k == elems-1) {
				elems--;
			}else {
				for(int i = k; i< elems-1 ; i++){
					intArray[i] = intArray[i+1];
				}
				elems--;
			}
			return true;
		}
	}
	//修改数据 oldValue原值 newValue新值 修改成功返回true，修改失败返回false
	public boolean modify(int oldValue,int newValue) {
		int i = find(oldValue);
		if(i==-1) {
			System.out.println("数据不存在无法删除");
			return false;
		}else {
			intArray[i] = newValue;
			return true;
		}
	}
}

