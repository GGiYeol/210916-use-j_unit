package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex06 {
	public int max(List<Integer> list) {
		
		//list의 아이템 중 최대값 리턴
//		int max = Collections.max(list);
		int max = list.get(0);
		for(int a : list) {
			max = Math.max(max, a);
		}
//		int max = list.get(0);
//		for(int item : list) {
//			max = (max<item) ? item : max;
//		}
		
		return max;
	}
}
