package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex03Test {

	@Test
	void test() {
		assertEquals(0,0); //두개의 파라미터로 받은 값이 같은지 확인.
		//초록색 바가 뜨면 잘 되었다는 뜻.
		assertEquals(1,1); 
		assertEquals(2.12,2.12);
		//하나라도 실패하면 빨간색 바가 뜬다
//		assertEquals(2.12,2.13);
		//ex03의 인스턴스를 만들어서 검증
		Ex03 e = new Ex03();
		assertEquals(0,e.triple(0)); //첫번째 파라미터 기댓값, 두번째 파라미터 작성되는 값
		assertEquals(3,e.triple(1)); //무조건 0이 나오게 했으니 빨간색 바가 뜨고, 목록에 어느곳이 실패앴는지 뜬다.
		assertEquals(6,e.triple(2)); //문제를 해결하고 난 뒤는 test가 다 초록바가 뜬다. 
	
	}

}
