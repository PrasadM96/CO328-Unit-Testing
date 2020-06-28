package ex1;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Test1 {
	
	@Test
	public void averageTest(){
		HistoricalData historicalData = new HistoricalData(0.0,0.0,0);
		assertThrows(IllegalStateException.class, () -> historicalData.average() ,"If no measurement found(count=0),then an IllegalStateException should be thrown ");
	
	}
	
	@Test
	public void maxTest(){
		HistoricalData historicalData = new HistoricalData(0.0,0.0,0);
		assertThrows(IllegalStateException.class,()->historicalData.max(),"If no measurement found(count=0), then an IllegalStateException should be thrown ");

	}
	
	@Test
	public void addTest(){
		HistoricalData historicalData = new HistoricalData(0.0,0.0,0);
		historicalData.add(20);
		double result = historicalData.max();
		
		assertEquals(20,result,"If the measurement is greater than the max value the max variable should be updated ");
	}
	
	@Test void maxVariableTest(){
		//assume that initial count = 0
		HistoricalData historicalData = new HistoricalData(0.0,Double.NEGATIVE_INFINITY,1);
		//Here we check whether the initial value of max variable is smaller than -50(an instance of measurement) or not. 
		assertTrue(historicalData.max()<-50,"Initial value of max variable should be initiallized to a smallest possible value");
	}
}
