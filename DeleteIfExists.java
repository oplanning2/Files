

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class DeleteIfExists {

	public static void main(String args[]) {

		String[] path = { "Users", "rp246", "workspace", "File", "Delete.txt" };

		System.out.println("Path:" + Paths.get("C:", path));
		try {
			Files.deleteIfExists(Paths.get("C:", path));
		}// Exceptions
		catch (NoSuchFileException e) {
			System.out.println("No such file/directory exists");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
		}

		System.out.println("Deletion successful:");
	}

}
