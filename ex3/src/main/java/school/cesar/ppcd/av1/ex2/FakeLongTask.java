package school.cesar.ppcd.av1.ex2;

import java.util.concurrent.Semaphore;
import static school.cesar.ppcd.av1.ex2.Util.nap;

public class FakeLongTask implements Runnable {
	// não usarei boolean
	//private boolean done = false;
	private static final long ONE_MINUTE = 60 * 1000;
	private Semaphore Mutex;

	public FakeLongTask(Semaphore mutex) {
		this.Mutex = mutex;
	}

	public void run() {
		try{
			nap(ONE_MINUTE);
			synchronized(Mutex){
				Mutex.notify();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
