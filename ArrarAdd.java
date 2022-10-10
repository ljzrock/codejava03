
public class ArrarAdd {

	public static void main(String[] args) {
		//数组添加
		/*定义原始数组 int[] arr = {1,2,3}
		 * 定义新数组 int[] arrNew = int[arr.length+1];
		 * 遍历数组arr  将arr数组元素赋给arrNew 
		 * 然后再将4赋给arrNew[arrNew.length-1]
		 * 最后再将arrNew地址传给原数组arr
		 *代码实现： 
		 * */
          int[] arr = {1,2,3};//定义原始数组
          int[] arrNew = new  int[arr.length+1];//创建新数组 且长度时原数组长度+1
         for(int i = 0;i < arr.length;i++) {
               arrNew[i] = arr[i];      	 
         }
         arrNew[arrNew.length-1] = 4;//这一步时将arrNew数组增加了一个4
         arr = arrNew; //这里将arrNew新数组地址拷贝给原数组arrr
         for(int i = 0;i < arr.length;i++) {
        	 System.out.print(arr[i]+" ");//输出原数组
         }
         
	}

}
