package Fnlo.Test.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Random_01 {

	public final static int num = 300000000;
//	public final static float threshold = 0.0f;
	
	//这十组的数字出现概率根据阈值出现概率有所提高/或下降
	//本次不同出现相同组合 
	public static List<int[]> lastTenGroup = new ArrayList<>();
	public static List<int[]> lastTenGroup2 = new ArrayList<>();
	
	//记录在生成一组新的组合时每个数字被选中的概率
	public static Map<Integer, Float> mapWhenCreateOne = new HashMap<>();
	public static Map<Integer, Float> mapWhenCreateOne2 = new HashMap<>();
	
	//百万次所有的组合 以及每种组合重复的次数
	public static Map<int[], Integer> map = new HashMap<>();
	
	//最近几次出现的数字以及其占的概率
//	public static Map<Integer, Float> mapLastTenNumber = new HashMap<>();
	
	//1-35 
	public static int[] shu1 = new int[35];
	//1-12
	public static int[] shu2 = new int[12];
			
	//may be 时间戳
	public static void init(){
		for(int i = 1; i < shu1.length + 1; i++){
			shu1[i - 1] = i;
			mapWhenCreateOne.put(i, (float) 1 / shu1.length);
		}
		for(int i = 1; i < shu2.length + 1; i++){
			shu2[i - 1] = i;
			mapWhenCreateOne2.put(i, (float) 1 / shu2.length);
		}
		
		int[] one = new int[]{16,18,24,25,27};
		int[] two = new int[]{6,22,28,29,33};
		int[] three = new int[]{1,4,18,24,28};
		int[] four = new int[]{7,9,13,14,33};
		int[] five = new int[]{3,8,21,26,33};
		int[] six = new int[]{1,4,7,11,30};
		int[] seven = new int[]{1,2,4,16,24};
		int[] eight = new int[]{8,12,15,27,30};
		int[] nine = new int[]{1,3,5,7,18};
		int[] ten = new int[]{3,9,21,28,30};
		int[] eleven = new int[]{6,16,26,33,35};
		int[] x19036 = new int[]{5,11,16,18,27};
		int[] x19037 = new int[]{1,12,18,26,35};
		int[] x19038 = new int[]{1,3,31,32,34};
		lastTenGroup.add(one);
		lastTenGroup.add(two);
		lastTenGroup.add(three);
		lastTenGroup.add(four);
		lastTenGroup.add(five);
		lastTenGroup.add(six);
		lastTenGroup.add(seven);
		lastTenGroup.add(eight);
		lastTenGroup.add(nine);
		lastTenGroup.add(ten);
		lastTenGroup.add(eleven);
		lastTenGroup.add(x19036);
		lastTenGroup.add(x19037);
		lastTenGroup.add(x19038);
		
		int[] one2 = new int[]{2,7};
		int[] two2 = new int[]{2,7};
		int[] three2 = new int[]{2,3};
		int[] four2 = new int[]{2,4};
		int[] five2 = new int[]{4,5};
		int[] six2 = new int[]{7,8};
		int[] seven2 = new int[]{7,9};
		int[] eight2 = new int[]{1,2};
		int[] nine2 = new int[]{8,9};
		int[] ten2 = new int[]{1,12};
		int[] eleven2 = new int[]{4,8};
		int[] xx19036 = new int[]{7,12};
		int[] xx19037 = new int[]{6,12};
		int[] xx19038 = new int[]{1,3};
		lastTenGroup2.add(one2);
		lastTenGroup2.add(two2);
		lastTenGroup2.add(three2);
		lastTenGroup2.add(four2);
		lastTenGroup2.add(five2);
		lastTenGroup2.add(six2);
		lastTenGroup2.add(seven2);
		lastTenGroup2.add(eight2);
		lastTenGroup2.add(nine2);
		lastTenGroup2.add(ten2);
		lastTenGroup2.add(eleven2);
		lastTenGroup2.add(xx19036);
		lastTenGroup2.add(xx19037);
		lastTenGroup2.add(xx19038);
		
	}

	public static Map<Integer, Float> getAlreadyHaveNumberInLastten(List<int[]> lastTen){
		Map<Integer, Float> map = new HashMap<>();
		Map<Integer, Integer> mapTemp = new HashMap<>();
		int count = 0;
		for(int[] x : lastTen){
			for(int xx : x){
				count++;
				mapTemp.put(xx, mapTemp.getOrDefault(xx, 0) + 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : mapTemp.entrySet()){
			map.put(entry.getKey(), (float) entry.getValue() / (float) count);
		}
		return map;
	}
	
	//根据最后几次的概率调整每个数字被选中的概率，该方法模拟用户在受到心里影响时，偏向于某几个数字，导致数字选中的概率的变化
	public static Map<Integer, Float> resetMapWhenCreateOneWithLastTen(Map<Integer, Float> map, Map<Integer, Float> lastTenMap){
		float count = 0f ;
		for(Map.Entry<Integer, Float> entry: lastTenMap.entrySet()){
			float temp = map.get(entry.getKey()) * (1 + entry.getValue());
			map.put(entry.getKey(), temp);
		}
		for(Map.Entry<Integer, Float> entry: map.entrySet()){
			count += map.get(entry.getKey());
		}
		
		for(Map.Entry<Integer, Float> entry: map.entrySet()){
			map.put(entry.getKey(), map.get(entry.getKey()) / count );
		}
		return map;
	}
	
	//生成一组随机数 5 个前  2个后，生成概率受到阈值影响
	public static IntArray makeOne(int length, Map<Integer, Float> map){
		int[] res = new int[length];
		List<Integer> list = new ArrayList<>();
		int m = 0;

//		System.out.println();
		while(m < length){
			float temp = 0f;
			
			long t = System.nanoTime();
			Random random = new Random(t);
			double randomNumber = random.nextDouble();
			for(Map.Entry<Integer, Float> entry : map.entrySet()){
				if(randomNumber >= temp && randomNumber < entry.getValue() + temp){
					if(list.contains(entry.getKey())){
						continue;
					}
//					res[m] = entry.getKey();
					list.add(entry.getKey());

//					System.out.print(" " + entry.getKey() + " ");
					m++;
				}
				temp += entry.getValue();
			}
		}
		res = list.stream().mapToInt(Integer::valueOf).toArray();
		/*for(int i = 0; i < length; i++){
			float temp = 0f;
			double randomNumber = Math.random();
			for(Map.Entry<Integer, Float> entry : map.entrySet()){
				if(randomNumber >= temp && randomNumber < entry.getValue() + temp){
					res[i] = entry.getKey();
				}
				temp += entry.getValue();
			}
		}*/
		
		//sort
		Arrays.sort(res);
		IntArray intarray = new IntArray();
		intarray.setArray(res);
		return intarray;
	}
	
	//生成百万条模拟数据
	public static Map<IntArray, Integer> makeAll(int count, Map<Integer, Float> map){
		Map<IntArray, Integer> res = new HashMap<>();
		if(!(map.size() == 12 || map.size() == 35)){
			System.out.println("something wrong : size not 12 or 35");
			return null;
		}
		
		do{
			System.out.println(count);
			IntArray x = map.size() == 12 ? makeOne(2, map) : makeOne(5, map);
			
//			if(res.containsKey(x)){
//				System.out.println("chongle" );
//			}
			res.put(x, res.getOrDefault(x, 0) + 1);
			
			count --;
		}while(count >= 0);
		System.out.println("end");
		return res;
	}
	
	public static Map<IntArray, Integer> sortMap(Map<IntArray, Integer> map){
		List<Map.Entry<IntArray, Integer>> list = new LinkedList<Map.Entry<IntArray, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<IntArray, Integer>>() {
			@Override
			public int compare(Entry<IntArray, Integer> o1,
					Entry<IntArray, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		Iterator<Map.Entry<IntArray, Integer>> iter = list.iterator();
		Map<IntArray, Integer> result = new LinkedHashMap<IntArray, Integer>();
		Map.Entry<IntArray, Integer> tempEntry = null;
		while(iter.hasNext()){
			tempEntry = iter.next();
            result.put(tempEntry.getKey(), tempEntry.getValue());
		}
        return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		
		System.out.println("5红：");
		Map<Integer, Float> mapLastTenNumber = getAlreadyHaveNumberInLastten(lastTenGroup);
		Map<Integer, Float> mapWhenCreateOneAfterCalculate = resetMapWhenCreateOneWithLastTen(mapWhenCreateOne, mapLastTenNumber);
		long timeStart = System.currentTimeMillis();
		Map<IntArray, Integer> mapRes = makeAll(num, mapWhenCreateOneAfterCalculate);
		Map<IntArray, Integer> sortMap = sortMap(mapRes);
		long timeStop = System.currentTimeMillis();
		System.out.println("5 耗时 ： " + (timeStop - timeStart) + "ms");
		
		System.out.println("2蓝：");
		Map<Integer, Float> mapLastTenNumber2 = getAlreadyHaveNumberInLastten(lastTenGroup2);
		Map<Integer, Float> mapWhenCreateOneAfterCalculate2 = resetMapWhenCreateOneWithLastTen(mapWhenCreateOne2, mapLastTenNumber2);
		long timeStart2 = System.currentTimeMillis();
		Map<IntArray, Integer> mapRes2 = makeAll(num, mapWhenCreateOneAfterCalculate2);
		Map<IntArray, Integer> sortMap2 = sortMap(mapRes2);
		long timeStop2 = System.currentTimeMillis();
		System.out.println("2 耗时 ： " + (timeStop2 - timeStart2) + "ms");
		
	}
}
