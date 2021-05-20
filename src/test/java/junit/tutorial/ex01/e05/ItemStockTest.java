package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ItemStockTest {

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
	
	ItemStock itemStock=new ItemStock();
	String name="";
	int price=0;
	Item item=new Item(name,price);
	@Test
	void ex01e05test1() {
		assertEquals(0,itemStock.getNum(item));
	}
	@Test
	void ex01e05test2() {
		String name="éRâ∫";
		item.setName(name);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item));
	}
	@Test
	void ex01e05test3() {
		ex01e05test2();
		assertEquals(1,itemStock.getNum(item));
	}
	@Test
	void ex01e05test4() {
		ex01e05test2();
		String name="éRâ∫";
		item.setName(name);
		itemStock.add(item);
		assertEquals(2,itemStock.getNum(item));
	}
	@Test
	void ex01e05test5() {
		ex01e05test2();
		String name="äCêl";
		item.setName(name);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item));
	}
}
