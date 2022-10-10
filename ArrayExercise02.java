
public class ArrayExercise02 {

	public static void main(String[] args) {
		// 求出数组int[] array = { 4,-1,9,10,23}中最大值并显示下标
	
		int array[] = {4,-1,9,10,23};
		int maxnum = array[0];//比较数组元素大小先创建变量假定为最大值 然后遍历数组与之比较 
		int maxIndex = 0;//记录下标
		for(int i = 1;i < array.length;i++) {
			if(maxnum < array[i]) {
				maxnum = array[i];
				maxIndex = i;
			}	
		}	
		System.out.println("最大值是："+maxnum+"下标是："+maxIndex);
	}

}
