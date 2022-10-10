
public class ArrayExercise01 {

	public static void main(String[] args) {
		// 利用数组来输出A-Z 提示;'A'+ 1 =B
		char chars[] = new char[26];//定义并创建chars数组 数组元素有26个
		for(int i = 0;i < 26;i++) {//利用for循环来为数组元素动态赋值
			chars[i] = (char)('A' + i);//大写字母输出 'A'+1是int数据 在这里需要强制转换
		}
		for(int i = 0;i < 26;i++) {  //利用for循环实现对数组下表的引用
			System.out.print(chars[i]+" "); //并实现遍历数组输出大写A-Z
		}

	}

}
