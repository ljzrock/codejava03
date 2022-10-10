
public class ArrayCopy {

	public static void main(String[] args) {
		// 数组元素拷贝 （内容复制） 若要将一个数组元素拷贝到另一个数组中去 就要重新创建一个新的数组
		/*在栈中会指向新的地址 ；在堆中开辟新的空间来存放数组元素
		 *代码演示：
		 * */
         int[] arr1 = {1,2,3};
         int[] arr2 = new int[arr1.length];//通过 new 操作使得arr2指向新的地址 并开辟新的内存空间
         for(int i = 0;i<arr1.length;i++) {
                  arr2[i] = arr1[i]; //这一步将arr1 中的元素原样赋给arr2中去
                  System.out.print(arr2[i]+" ");//runresult:1 2 3 
         }
         System.out.println();
         for(int i = 0;i<arr1.length;i++) {
        	 System.out.print(arr1[i]+" ");//runresult:1 2 3 
         }
         /*上述代码演示数组拷贝 将数组元素给另外一个数组
          * 并且不会改变原数组元素
          * 
          * */
	}

}
