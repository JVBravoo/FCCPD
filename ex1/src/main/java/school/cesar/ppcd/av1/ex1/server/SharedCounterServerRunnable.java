package school.cesar.ppcd.av1.ex1.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.net.Socket;

public class SharedCounterServerRunnable implements Runnable{
	private Socket client;
	private DataOutputStream dataOutputStream;
	private DataInputStream dataInputStream;
	static int counter = 0;
	int att;
	private static final byte[] INC = new byte[] { 'I' };
	
	public SharedCounterServerRunnable(Socket client) throws IOException{
		this.client = client;
		this.dataInputStream = new DataInputStream(client.getInputStream());
		this.dataOutputStream = new DataOutputStream(client.getOutputStream());
	}
	
	public void run(){
		// TODO Auto-generated method stub
		try{
			while(true){
				if (this.dataInputStream.read(INC) == 1){
					att = counter;
					counter++;
					this.dataOutputStream.writeInt(att);
					TimeUnit.SECONDS.sleep(1);
				}
			}
		}
		catch (Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
	}
}
