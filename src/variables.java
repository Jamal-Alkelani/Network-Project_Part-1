import java.net.Socket;
import java.util.ArrayList;

public class variables {

	private int server_port ;
	
	private String server_IP;
	
    public static ArrayList <Socket> socketArray = new <Socket>ArrayList() ;
    
    public static String [] IPs = {};
	
	
	public static  String [] getIPs () {
		
		int x = socketArray.size();
		
		  String [] IPs = new String [x];
		  
		  for (int i=0;i<x;i++) {
			  
			  IPs[i]= socketArray.get(i).getLocalAddress().toString();
		
		  }
		  
		
		return IPs;
	}

	public int getServer_port() {
		return server_port;
	}

	public void setServer_port(int server_port) {
		this.server_port = server_port;
	}

	public String getServer_IP() {
		return server_IP;
	}

	public void setServer_IP(String server_IP) {
		this.server_IP = server_IP;
	}
	
	
	
}
