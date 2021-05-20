package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class RangeTest {

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
	@ParameterizedTest
	@CsvSource({"-0.1,false",
				"0.0,true",
				"10.5,true",
				"10.6,false"})
	void ex02e04test1(double value,boolean expect) {
		Range range=new Range(0.0, 10.5);
		if(expect) {
		assertTrue(range.contains(value));
		assertTrue(range.contains(value));
		}else {
		assertFalse(range.contains(value));
		assertFalse(range.contains(value));
		}
	}
	
	@ParameterizedTest
	@CsvSource({"-5.2,false",
				"-5.1,true",
				"5.1,true",
				"5.2,false"})
	void ex02e04test2(double value,boolean expect) {
		Range range=new Range(-5.1, 5.1);
		if(expect) {
		assertTrue(range.contains(value));
		assertTrue(range.contains(value));
		}else {
		assertFalse(range.contains(value));
		assertFalse(range.contains(value));
		}
	}

}
