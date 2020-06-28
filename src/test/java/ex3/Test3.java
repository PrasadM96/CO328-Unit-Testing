package ex3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Test3{
	
	@Test
	public void grabMaxibonsTest(){
		Office office = new Office(2);
		office.openFridge(Developer.PEDRO);
		assertEquals(10,office.maxibonsLeft,"If there are fewer maxibons left than what the developer wants, he should take the maxibons left.");
	}
	
	@Test
	public void openFridgeTest(){
		Office office = new Office(4);
		office.openFridge(Developer.SERGIO);
		assertEquals(10,office.maxibonsLeft,"Once there are 2 or fewer maxibons they should order 10 maxibons more");
	}
}
