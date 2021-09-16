package p15collection.p02quiz;

import java.util.List;

public class Ex09 {
	public void removeLastMax(List<Integer> list) {
		//list의 가장 큰값 중 마지막 가장 큰값을 삭제
		
//		int max = list.get(0);
//		int index = 0;
//		
//	
//		for(int a : list) {
//			max = Math.max(max,a);
//			index = list.lastIndexOf(max);
//		}
//		
		int index = list.size()-1;
		int max = list.get(list.size()-1);
		
		for (int i = list.size() -2; i >= 0; i--) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}
		list.remove(index);
				
	}
}
