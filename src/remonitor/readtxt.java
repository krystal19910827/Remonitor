package remonitor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class readtxt {
	public static String[] Readfile() {  
		String line = null;
		StringBuffer smz=new StringBuffer();
		String[] list=null;
		File file = new File("remonitor.txt");
	    try {
	    InputStreamReader read = new InputStreamReader(new FileInputStream(file), "gbk");
		BufferedReader input=new BufferedReader(read); 
	          while ((line = input.readLine()) != null ) {	 
	        	  line=line.trim();
                smz=smz.append(line).append(" "); 
	            }  
		  	  list=smz.toString().split(" "); 
	            input.close();
	            read.close(); 	         
	        }catch (Exception e) {
	    		System.out.println(e);}
	    return list;
	}
}