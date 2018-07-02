import java.io.BufferedReader;
import java.io.IOException;

public class ClientListener implements Runnable {
	private BufferedReader inFromServer;
	private String serverMsg;
	public ClientListener(BufferedReader fromServer) {
		inFromServer=fromServer;
	}
	
	@Override
	public void run() {
		while (true) {
		try {
			serverMsg=inFromServer.readLine();
			Thread.sleep(100);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!serverMsg.isEmpty()) {
			ClientSide.updateUI("Server: "+serverMsg+"\n");
			serverMsg="";
		}
		
	}
	}
}
