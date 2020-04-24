package school.cesar.ppcd.av1.ex2;

import java.util.concurrent.Semaphore;

public class Main {
	public static void main(String[] args) {
		Semaphore Mutex = new Semaphore(0);
		FakeLongTask fakeLongTask = new FakeLongTask(Mutex);
		Thread threadFakeLongTask = new Thread(fakeLongTask);
		threadFakeLongTask.start();
		// não usarei boolean
		//while (!fakeLongTask.isDone()) {
		//	System.out.println("waiting...");
		//}

		synchronized(Mutex){
			System.out.println("Waiting...");
			try{
				Mutex.wait();
				System.out.println("Done!!");
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
