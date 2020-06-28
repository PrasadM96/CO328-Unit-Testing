package ex2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Task2{
	
	@Test
	public void tickClockTest(){
		Clock clock =  new Clock();
		clock.setTime(23,59,0);
		
		for (int i=0;i<60;i++){
			clock.tick();
		}	
		assertEquals(0,clock.hour,"If hour is reached 23, then next value of hour should be 0");
	}
	
	@Test
	public void tickAlarmClockTest(){
		AlarmClock alarmclock = new AlarmClock();
		alarmclock.setTime(10,20,0);
		alarmclock.setAlarmTime(10,21);
		
		for(int i=0;i<120;i++){
			alarmclock.tick();
		}
		
		assertEquals(false,alarmclock.alarmRinging,"After starting to ring the alarm, when the next minute is reached the alarm must switch off");
		
	}
}