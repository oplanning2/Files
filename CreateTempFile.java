

import java.io.File;
import java.io.IOException;

public class CreateTempFile 

{

	public static void main(String[] args) throws IOException{
    // Try block to check for exceptions
    try {

        // Step 1
        // Creating temporary file with default location
        // by creating an object of File type
        File obj1 = File.createTempFile("temp", ".txt");

        // Step 2
        // Obtaining absolute path of the path
        // returned by createTempfile() function
        String path = obj1.getAbsolutePath();

        // Step 3
        // Print and display the default path of
        // temporary file
        System.out.println(
            "Path of temporary file with default location:"
            + path);

       // Step 4
        // Creating temporary file with specified
        // location again by creating another object of
        // File type which is custom local directory
        File obj2 = File.createTempFile(
            "temp", ".txt",
            new File(
                "C:\\Users\\rp246\\Desktop\\myfolder"));

        // Step 5
        // Obtaining absolute path of the path
        // returned by createTempfile() function
        path = obj2.getAbsolutePath();

        // Step 6
        // Print and display the specified path of
        // temporary file
        System.out.println(
            "Path of temporary file with specified location:"
            + path);
        
        System.out.println(
                "temp file created successfully:");
    }

    // Catch block to handle exception if occurs
    catch (IOException e) {

        // Print the line number where exception occur
        // using printStackTrace() method
        e.printStackTrace();
    }
	}
}
