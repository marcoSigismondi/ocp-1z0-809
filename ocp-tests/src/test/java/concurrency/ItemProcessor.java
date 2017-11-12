package concurrency;

import java.util.concurrent.CyclicBarrier;

public class ItemProcessor extends Thread implements Runnable {

	CyclicBarrier cb;

	public ItemProcessor(CyclicBarrier cb) {
		this.cb = cb;
	}

	public void run() {
		System.out.println("processed");
		try {
			System.out.println(cb.getNumberWaiting());
			cb.await();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
