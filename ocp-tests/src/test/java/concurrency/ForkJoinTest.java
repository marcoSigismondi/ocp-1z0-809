package concurrency;

import static org.junit.Assert.*;

import java.util.concurrent.ForkJoinPool;

import org.junit.Test;

public class ForkJoinTest {

	@Test
	public void RecursiveActionImplementationTest() {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		RecursiveActionImplementation action = new RecursiveActionImplementation(1000);
		forkJoinPool.invoke(action);
	}

}
