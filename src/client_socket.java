
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class client_socket extends Thread {
	
	   Socket clientSocket;
	   String sentence;
	   server_side serverUI;
	   public client_socket(Socket socket , server_side serverUI) {
		   
		   clientSocket=socket;
		   this.serverUI=serverUI;
	   
	   	}
	
       @Override 
       
       public void run() {
    	 while(true) {  
    	   try {
			
    		   BufferedReader inFromClient = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
		
    		   sentence = clientSocket.getLocalAddress().toString();
    		  
    		   sentence= "\n"+sentence+"  : "+inFromClient.readLine()+ "\n"; 
    		   
    		   serverUI.setText(sentence);
    		   
    		  // System.out.println(sentence);
    		   
    		   
    		   
    	   // print it to the text field
    	   
    	   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	          
    	   
       }
    	 
       }

}
