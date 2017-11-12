package concurrency;

import static org.junit.Assert.*;

import org.junit.Test;

public class LockOnField {
	
	public static class WrongLock extends Thread{
		
		Object obj = new Object();
		static int x, y = 0;

		@Override
		public void run() {
			
			synchronized (obj) {
				x++;
				y++;
				System.out.println(this.getClass().getSimpleName() +  "x -->" + x);
				System.out.println(this.getClass().getSimpleName() +  "y -->" + y);
			}
		}	
	}
	
public static class RightLock extends Thread{
		
		Object obj = new Object();
		static int x, y = 0;

		@Override
		public void run() {
			
			synchronized (this) {
				x++;
				y++;
				System.out.println(this.getClass().getSimpleName() +  "x -->" + x);
				System.out.println(this.getClass().getSimpleName() +  "y -->" + y);
			}
		}	
	}

	@Test
	public void test() {
//		for(int i = 0; i < 20; i++) {
//			new WrongLock().start();
//		}
		
		for(int i = 0; i < 20; i++) {
			new RightLock().start();
		}
	}

}
