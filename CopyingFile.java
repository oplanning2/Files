

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyingFile {

	public static void main(String[] args) throws IOException {
		
		String srcFile = "C:\\Users\\rp246\\workspace\\File\\Input.txt";
	      
	       String destFile = "C:\\Users\\rp246\\workspace\\File\\output.txt";
	       
		FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            
			sourceChannel = new FileInputStream(srcFile).getChannel();
			 
            destChannel = new FileOutputStream(destFile).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
			 
            System.out.println("File copied Successfully");
           }
        catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
        catch (IOException e) {
			
			e.printStackTrace();
		}finally{
               sourceChannel.close();
               destChannel.close();
       }
    	

	}

}
