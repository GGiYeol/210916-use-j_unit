package p15collection.p02quiz;

import java.util.ArrayList;

public class Ex13 {
	 public static void main(String[] args) {
		//Math.random();
		 //1~45사이의 값 6개 랜덤
		 
		 ArrayList<Integer> lotto = new ArrayList<>();
		 
		 //코드 작성
		 while(lotto.size()<6) {
		 int random = (int)(Math.random() * 45) + 1;
		 if(!lotto.contains(random)){
			 System.out.println(random);
			 lotto.add(random);
		 	}
		 }
		 System.out.println("======================");
		 for(int l : lotto) {
			 System.out.println(l); //6개 랜덤
		 }
	 }
}
