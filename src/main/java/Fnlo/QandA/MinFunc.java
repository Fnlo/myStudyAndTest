package Fnlo.QandA;

/**
 * @author Fnlo
 *	实现最小值函数
	自己设计一个泛型的获取数组最小值的函数.并且这个方法只能接受Number的子类并且实现了Comparable接口。
	int minInteger = min(new Integer[]{1, 2, 3});//result:1
	double minDouble = min(new Double[]{1.2, 2.2, -1d});//result:-1d
	String typeError = min(new String[]{"1","3"});//报错
 */
public class MinFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] integerArray = new Integer[]{0, 1, 2, 3, -1};
		System.out.println(MinFunc.min(integerArray));
		 
		 
	}

	
	public static <T extends Number & Comparable<? super T>> T min(T[] array){
		if(array == null || array.length == 0){
			return null;
		}
		T min = array[0];
		for(T obj : array){
//			(min.compareTo(obj) >= 0) ? (min = obj) : (min = min);
			if(min.compareTo(obj) >= 0){
				min = obj;
			}
		}
		return min;
	}
	
}
