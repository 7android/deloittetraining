package teststring;
import java.io.File;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		File f = new File ("C:\\deloitte\\Batch");
		File f1 = new File("C:\\deloitte\\Batch\\BatchMates.txt");
		File f2 = new File("C:\\deloitte\\Batch\\Class");
		if (f.exists())
		{
			f.delete();
			System.out.println("Folder already exists and replaced");
			f2.mkdirs();
			f1.createNewFile();	
		}
		else
		{
			f2.mkdirs();
			f1.createNewFile();			
			System.out.println("File and folder created");
		}
		
		File allFiles[] = f.listFiles();
		for (File temp: allFiles)
		{
			System.out.println(temp);
		}
	}

}
