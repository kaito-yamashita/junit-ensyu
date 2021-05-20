package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ex01e03test1() {
		Counter count=new Counter();
		assertEquals(1,count.increment());
	}
	@Test
	void ex01e03test2() {
		Counter count=new Counter();
		int result=0;
		for(int i=0;i<=1;i++) {
			result=count.increment();
		}
		assertEquals(2,result);
	}
	@Test
	void ex01e03test3() {
		Counter count=new Counter();
		int result=0;
		for(int i=0;i<=50;i++) {
			result=count.increment();
		}
		assertEquals(51,result);
	}
}
