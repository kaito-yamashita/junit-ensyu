package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	void ex01test1() {
		assertEquals("aaa",StringUtils.toSnakeCase("aaa"),"����");
	}
	@Test
	void  ex01test2() {
		assertEquals("hello_world",StringUtils.toSnakeCase("HelloWorld"),"����");
	}
	@Test
	void  ex01test3() {
		assertEquals("practice_junit",StringUtils.toSnakeCase("practiceJunit"),"����");
	}
}
