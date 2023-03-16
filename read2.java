import java.io.*;
class read2
{
	public static void main(String args[])
	{
		try
		{
			int b;
			FileInputStream fis= new FileInputStream("C:\\kinjal\\java\\text2.txt");
			while((b = fis.read())!=-1)
			{
				System.out.println((char)b);
			}	
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
}