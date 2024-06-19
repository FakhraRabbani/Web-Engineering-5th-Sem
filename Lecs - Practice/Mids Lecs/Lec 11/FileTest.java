import java.util.*;
import java.io.*;

public class FileTest
{

	public static void main(String args[])
	{

		try
		{
			File f = new File("test.txt");

			System.out.println("File Name: " + f.getName());
			System.out.println("File Exists: " + f.exists());
			System.out.println("File can be read: " + f.canRead());
			System.out.println("File can be wrote: " + f.canWrite());
			System.out.println("File Path: " + f.getPath());
			System.out.println("Absolute Path: " + f.getAbsolutePath());
			System.out.println("Absolute File: " + f.getAbsoluteFile());
			System.out.println("URL: " + f.toURL());
			System.out.println("File Parent: " + f.getParent());
			System.out.println("It is a file: " + f.isFile());
			System.out.println("It is a directory: " + f.isDirectory());
			System.out.println("It is hidden: " + f.isHidden());
			System.out.println("File Length: " + f.length());
			System.out.println("File was last modified at: " + new Date(f.lastModified()));

			if(f.isDirectory())
			{
				String[] subFiles = f.list();

				for(int i = 0; i < subFiles.length; i++)
				{
					System.out.println("File in this directory: " + subFiles[i]);
				}
			}
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
}
