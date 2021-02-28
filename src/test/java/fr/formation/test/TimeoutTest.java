package fr.formation.test;

import java.util.Random;

import org.junit.Test;

public class TimeoutTest {
	

	@Test(timeout = 250)
	public void testTimeout() {
		timeout();
	}
	
	
	private void timeout()  {
		long time = new Random().nextInt(500);
		System.out.println("sleep " + time + " ms");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}
	
}

