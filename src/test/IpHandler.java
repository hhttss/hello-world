package test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpHandler {
	public void IpHandler(){
		
	}
	
	public String getHostIp() throws IOException{
		 InetAddress addr = InetAddress.getLocalHost();
		 String hostip = addr.getHostAddress().toString();
		 System.out.println("IpHandler:"+hostip);
		 return hostip;
	}

}
