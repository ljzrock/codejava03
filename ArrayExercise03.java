import java.util.Scanner;
public class ArrayExercise03 {

	public static void main(String[] args) {
		// 求int型数组各元素之和 并且求平均数 要求用户输入
        int arr[] = new int[5];
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);//创建scanner对象接收用户输入
        for(int i = 0;i < arr.length;i++) {
        	System.out.println("请输入第"+(i+1)+"个数：");
        	arr[i] = myScanner.nextInt();//将用户输入赋给数组arr
        }
        for(int i = 0;i < arr.length;i++) {//遍历数组
           
            sum += arr[i];//将数组总元素累加  	
        }
      System.out.println("输入的数总和是："+sum+"平均数是："+(sum/arr.length));         
	}

}
