import java.io.*;
class read1
{
	public static void main(String args[])
	{
		try
		{
			int b;
			FileInputStream fis= new FileInputStream("C:\\kinjal\\java\\text1.txt");
			b = fis.read();
			System.out.println((char)b);
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println("error");
		}
	}
}