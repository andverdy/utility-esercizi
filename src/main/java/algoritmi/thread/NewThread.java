package algoritmi.thread;

public class NewThread extends Thread implements Runnable {

	private boolean exitThread;

	public void run() {
		long startTime = System.currentTimeMillis();
		int i = 0;
		while(!exitThread) {
			System.out.println(this.getName() + ": New Thread is running..." + i++);
			try {
				// Wait for one sec so it doesn't print too fast
				Thread.sleep(10);
				if(i == 200) {
					stopThread();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// ...
		}
	}

	public void stopThread() {
		exitThread = true;
	}
}
