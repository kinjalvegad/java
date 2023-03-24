import java.io.*;
public class filedemo1
{
	public static void main(String args[])
	{
		try
		{
		File file = new File("javafile123.text");
		if(file.createNewFile())
		{
			System.out.println("new file creat");
		}
		else
		{
			System.out.println("file alread created");
		}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}