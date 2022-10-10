
import java.util.Scanner;
public class ArrayReduce {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};//定义原始数组
        do {
      	  int[] arrNew = new  int[arr.length-1];//创建新数组 且长度时原数组长度+1
      	  System.out.println("请输入要删除的数：");
       for(int i = 0;i < arr.length-1;i++) {
             arrNew[i] = arr[i];      	 
       }
       
       int Reducenum = myScanner.nextInt();
//      arrNew[arrNew.length-1] = arr[arr.length-2];  //这一步是将arr中倒数第二个数赋给arrnew最后一个元素
       
       arr = arrNew;                      //这里将arrNew新数组地址拷贝给原数组arrr
       
       for(int i = 0;i < arr.length;i++) {
      	 System.out.print(arr[i]+" ");//输出原数组
         }
       System.out.println("是否还要继续删除吗？~y/n");
       char key = myScanner.next().charAt(0);
       if(key == 'n'|| arr.length == 1) {
      	 break;
       }
       
       }while(true);
       System.out.println("程序退出！！");

	}

}
