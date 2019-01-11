package demo1;
/**
 * 冒泡算法
 * @author admin
 *
 */

public class BubbleSort {

	public static int[] sort(int[] array) {
		//一共要循环多少轮
		for(int i = 1; i<array.length;i++) {
			//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
			boolean flag =true;
			for(int j = 0; j < array.length-i ; j++){
				if(array[j]>array[j+1]){
					int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
				}
			}
			if (flag) {
				break;
			}
			//第 i轮排序的结果为
			System.out.print("第"+i+"轮排序后的结果为:");
            display(array);
		}
		return array;

	}
	//遍历显示数组
	private static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array = {4,2,8,9,5,7,6,1,3};
		System.out.println("没有排序的顺序");
		display(array);
		System.out.println("---------------------");
		array = sort(array);
		System.out.println("---------------------");
		System.out.println("经过冒泡排序后的数组顺序为：");
		display(array);
		
	}
	
}
