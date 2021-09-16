package p15collection.p02quiz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex05Test {

	@Test
	void test() {
	
		Ex05 e = new Ex05();
		assertEquals(10, e.sum("5 5"));
		assertEquals(10, e.sum2("5 5"));
	}

}
