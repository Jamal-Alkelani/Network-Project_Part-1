import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

	ServerSocket welcomeSocket;
	server_side serverUI;
	public Server(int port ) {
		
		 try {
			welcomeSocket = new ServerSocket(port);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
	}
	
	public void setServerUI(server_side serverUI) {
		this.serverUI=serverUI;
	}
	
	@Override
	
	public void run() {
		
		while (true) {
		 try {
			
			    
	            //System.out.println(welcomeSocket.getLocalSocketAddress().toString());
	          //  System.out.println();
			 Socket connectionSocket = welcomeSocket.accept();
			 
	          //  System.out.println(connectionSocket.getLocalSocketAddress().toString());
			// System.out.println();
			 String str = connectionSocket.getLocalAddress().toString();
			 
			 
			 
			 client_socket client=new client_socket(connectionSocket , serverUI);
			 
			 client.start();
			 //add to arraylist
			 
			 //System.out.println(variables.socketArray.size() +"\n");
			 
			 variables.socketArray.add(connectionSocket);
			 
			// System.out.println(variables.socketArray.size() +"\n");
			 
			 serverUI.setList(variables.getIPs());
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	
	
	
}
