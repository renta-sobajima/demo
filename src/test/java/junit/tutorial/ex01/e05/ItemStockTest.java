package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {
	ItemStock itemStock;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Item item = new Item("book",1000);
		ItemStock itemStock = new ItemStock();
		itemStock.add(item);
		this.itemStock = itemStock;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item(null,0);
		int result = itemStock.getNum(item);
		assertEquals(0,result,"error");
	}
	@Test
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item(null,0);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item),"error");
	}
	
	@Test
	void test3() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("book",1000);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item),"error");
	}
	
	@Test
	void test4() {
		Item item = new Item("book",1000);
		itemStock.add(item);
		assertEquals(2,itemStock.getNum(item),"error");
	}
	
	@Test
	void test5() {
		Item item = new Item("cd",100);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item),"error");
	}

}
