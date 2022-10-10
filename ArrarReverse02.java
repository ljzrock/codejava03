
public class ArrarReverse02 {

	public static void main(String[] args) {
		// 数组反转
		int[]  arr = {11,22,33,44,55,66};
		int temp = 0;//临时变量
		int len = arr.length;//数组长度；
		for(int i = 0;i < len/2;i++) {
			temp = arr[len-1-i];     //实现数组元素交换  第一个和最后一个交换
			arr[len-1-i] = arr[i];   //                 第二个和倒数第二个交换
			arr[i] = temp;           //                 第三个和倒数第三个交换
		}
		System.out.println("翻转后的数组情况：");	
	     for(int i = 0;i < arr.length;i++) {
	    	 System.out.print(arr[i]+" ");
	     }	
	     
	}

}
