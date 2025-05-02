

//Java Program to illustrate reading from FileReader
// using Scanner Class reading entire File
// without using loop
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadingFile {	

	    public static void main(String[] args)
	        throws IOException
	    {
	    	Scanner sc = null;
	    	try{       
	    	
	    	String srcFile = "C:\\Users\\rp246\\workspace\\File\\Input.txt";
	      
	        File srcfile = new File(srcFile);
	        
	        sc = new Scanner(srcfile);

	        // we just need to use \\Z as delimiter
	        sc.useDelimiter("\\Z");

	        
	        
	        System.out.println("File Read Successfully");
	    	}
	    	
	    	finally{
	    		if(sc!=null)
	    		{
	    			sc.close();
	    		}
	    	}
	        
	        
	    }
	}



