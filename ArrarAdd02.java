//import java.util.Scanner;
//public class ArrarAdd02 {
//
//	public static void main(String[] args) {
////		要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
////		1) 原始数组使用静态分配 int[] arr = {1,2,3}
////		2) 增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
////		3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
//		/* 1. 定义初始数组 int[] arr = {1,2,3}//下标 0-2
//		  2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
//		  3. 遍历 arr 数组，依次将 arr 的元素拷贝到 arrNew 数组
//		  4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把 4 赋给 arrNew 最后一个元素
//		  5. 让 arr 指向 arrNew ; arr = arrNew; 那么 原来 arr 数组就被销毁
//		  6. 创建一个 Scanner 可以接受用户输入
//		  7. 因为用户什么时候退出，不确定，老师使用 do-while + break 来控制
//		*/
//		//数组添加
//		/*定义原始数组 int[] arr = {1,2,3}
//		 * 定义新数组 int[] arrNew = int[arr.length+1];
//		 * 遍历数组arr  将arr数组元素赋给arrNew 
//		 * 然后再将4赋给arrNew[arrNew.length-1]
//		 * 最后再将arrNew地址传给原数组arr
//		 *代码实现： 
//		 * */
//		Scanner myScanner = new Scanner(System.in);
//          int[] arr = {1,2,3};//定义原始数组
//          do {
//        	  int[] arrNew = new  int[arr.length+1];//创建新数组 且长度时原数组长度+1
//        	  System.out.println("请输入要添加的数：");
//         for(int i = 0;i < arr.length;i++) {
//               arrNew[i] = arr[i];      	 
//         }
//         int Addnum = myScanner.nextInt();
//         arrNew[arrNew.length-1] = Addnum;//这一步时将arrNew数组增加了一个4
//         arr = arrNew; //这里将arrNew新数组地址拷贝给原数组arrr
//         for(int i = 0;i < arr.length;i++) {
//        	 System.out.print(arr[i]+" ");//输出原数组
//           }
//         System.out.println("是否还要继续添加~y/n");
//         char key = myScanner.next().charAt(0);
//         if(key == 'n') {
//        	 break;
//         }
//         }while(true);
//         System.out.println("程序退出！！");
//	}
//
//}
