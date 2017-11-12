package concurrency;

import static org.junit.Assert.*;

import java.util.concurrent.CyclicBarrier;

import org.junit.Test;

public class CyclicBarrierTest {

	@Test
	public void cyclicBarrierCostructorTest() {
		Merger m = new Merger();
		
		/*This call is synchronous and the thread calling this method suspends execution 
		 * till a specified number of threads have called the same method on the barrier.*/
		CyclicBarrier cb = new CyclicBarrier(2, m);
		ItemProcessor firstThread = new ItemProcessor(cb);
		firstThread.start();
	}

}
