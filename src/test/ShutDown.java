package test;

import java.io.IOException;

public class ShutDown{
	public void ShutDown(){
		
	}

	public void shutdown(int time) {
		Runtime r=Runtime.getRuntime();
		try{
			r.exec("shutdown -s -t "+time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void cancleshutdown(){
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("shutdown -a");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void restart(int time){
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("shutdown -r -t "+time);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void sleep(){
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("shutdown -h");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
