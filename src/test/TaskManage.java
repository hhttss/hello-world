package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskManage {
	public TaskManage(){
		
	}
	
	public void TaskKill(String tname) throws IOException{
		Runtime r = Runtime.getRuntime();
		r.exec("taskkill /im "+tname);
	}
	
	public String TaskList() throws IOException{
		String tnamelist="";
		Process pro = Runtime.getRuntime().exec("tasklist");
		BufferedReader br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
		while(br.readLine()!=null){
			tnamelist = tnamelist + br.readLine()+"^";
			System.out.println(br.readLine());
		}
		return tnamelist;
	}
}
