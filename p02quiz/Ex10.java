package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

	public ArrayList<Integer> evenList(List<Integer> list){
		//list의 짝수 아이템들만 모은 새 ArrayList를 받아 리턴
		ArrayList<Integer> newlist = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) % 2 == 0 ) {
				newlist.add(list.get(i));
			}
		}
		
		return newlist;
	}
}
