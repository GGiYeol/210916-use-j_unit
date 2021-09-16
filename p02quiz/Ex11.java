package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {

	public ArrayList<Integer> minMax(List<Integer> list){
		
		//파라미터로 받은 list의 최소값, 최대값을 아이템으로 갖는 arraylist 리턴
		ArrayList<Integer> newlist = new ArrayList<>();
		
		int max = list.get(0);
		int min = list.get(0);
		
		for(int a : list) {
			max = Math.max(max, a);
		}
		for(int a : list) {
			min = Math.min(min, a);
		}
		//집어넣는 순서에 따라 배열로 들어가니 순서를 신경써야 한다.
		newlist.add(min);
		newlist.add(max);
		
		return newlist;
	}

}
