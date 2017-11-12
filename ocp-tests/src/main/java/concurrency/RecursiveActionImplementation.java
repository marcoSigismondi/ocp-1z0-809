package concurrency;

import java.util.concurrent.RecursiveAction;

/*test RecursiveAction. Just print a thousand time "hello world"*/
public class RecursiveActionImplementation extends RecursiveAction{

	private static final long serialVersionUID = -3463911720017747128L;
	
	private static final int THRESHOLD = 100;
	
	public RecursiveActionImplementation(int numberOfPrint) {
		super();
		this.numberOfPrint = numberOfPrint;
	}


	private int numberOfPrint;

	public int getNumberOfPrint() {
		return numberOfPrint;
	}


	public void setNumberOfPrint(int numberOfPrint) {
		this.numberOfPrint = numberOfPrint;
	}


	@Override
	protected void compute() {
		
		if(numberOfPrint > THRESHOLD) {
			RecursiveActionImplementation recursiveActionImplementation = new RecursiveActionImplementation(numberOfPrint / 2);
			recursiveActionImplementation.fork();
		}else {
			System.out.println("hello world");
		}
	}

}
