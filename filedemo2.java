import java.io.*;
class filedemo2
{
	public static void main(String argc[])
	{
			String path="";
			boolean bool=false;
		try
		{
			File file=new File("textfile1.txt");
			file.createNewFile();
			System.out.println(file);
			File file2=file.getCanonicalFile();
			System.out.println(file2);
			bool=file2.exists();
			path=file2.getAbsolutePath();
			System.out.println(bool);
			if(bool)
			{
				System.out.println(path+"exists"+bool);
			}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
}