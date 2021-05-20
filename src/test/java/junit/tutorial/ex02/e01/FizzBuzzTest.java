package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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
	
	FizzBuzz fiz=new FizzBuzz();
	@Test
	void ex02e01test() {
		List<String> result = new ArrayList<>();
		result.add("1");
		result.add("2");
		result.add("Fizz");
		result.add("4");
		result.add("Buzz");
		result.add("Fizz");
		result.add("7");
		result.add("8");
		result.add("Fizz");
		result.add("Buzz");
		result.add("11");
		result.add("Fizz");
		result.add("13");
		result.add("14");
		result.add("FizzBuzz");
		result.add("16");
		assertEquals(result,fiz.createFizzBuzzList(16));
	}

}
