package demo1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 数组
 * @author admin
 *
 */

public class MyListTest {

	
	public static void main(String[] args) {
		//创建自定义封装数组结构，数组大小为4
		MyList array = new MyList(4);
		//添加4个元素分别是1,2,3,4
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		//显示数组元素
		 //array.display();
		//根据下标为0的元素
		int i = array.get(0);
		System.err.println(i);
		//删除4的元素
		
		array.delete(4);
		array.display();
		//将元素3修改为33
		//array.modify(3, 33);
	}

}
