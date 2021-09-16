package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex04Test {

	@Test
	void test() {
		
		Ex04 e = new Ex04();
		
		assertEquals(0,e.remainder(0));
		assertEquals(1,e.remainder(11));
		assertEquals(2,e.remainder(2));
		assertEquals(2,e.remainder(32));
		assertEquals(7,e.remainder(7));
	}
	
}
