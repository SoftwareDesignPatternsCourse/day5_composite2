import com.filestructure.model.File;
import com.filestructure.model.Folder;

public class FileSizeCounterMain {

	public static void main(String[] args) {
		
		// Create files
        File file1 = new File("text.txt", 10);
        File file2 = new File("text.txt", 10);
        File file3 = new File("text.txt", 10);

        // Create a directory
        Folder directory = new Folder("text.txt", 10);
        

        // Create a subdirectory
        Folder subdirectory = new Folder("text.txt", 10);
        System.out.println(directory.getInformation());
        System.out.println(subdirectory.getInformation());
        
	}

}
