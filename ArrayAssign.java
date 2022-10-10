
public class ArrayAssign {

	public static void main(String[] args) {
		//基本数据类型数据赋值在系统中是值传递
		int n1 = 10;
		int n2 = n1;
            n2 =20;
            System.out.println(n1); 
            System.out.println(n2);
// runresult: 10  
//            20  //这里表明n2的值如果被改变 n1的值不受任何影响 
            System.out.println("++++++++++++++++++");
            int[] arr1 = {10,20,30};
            int[] arr2 = arr1;
            arr2[0] = 100;
            for(int i = 0;i < arr1.length;i++) {
         	System.out.print(arr1[i]+" ");//runresult:100 20 30 
            	
//            	System.out.print(arr2[i]+" ");//runresult：100 20 30 
         	/*我们会发现arr1 和 arr2数组元素都被改变了 
         	 * 原因: 1,创建数组 数组名指向在栈中的地址是物理地址而在堆中有其对应都是地址空间存放数组元素
         	 * 2，数组赋值时：arr2  = arr1 java中是将arr1数组指向的地址赋值/拷贝给 arr2
         	 * 那么就可以说是数组arr1 and arr2 都指向同一个地址 
         	 * 3，当这两个数组中 任意一个数组元素发生改变会影响另外一个数组 即两个数组元素会同时改变
         	 * 4，这种情况是数组赋值时传递的不是具体数值 而是数组指向的地址传递 
         	 */
            } 
            
            
	}

}
