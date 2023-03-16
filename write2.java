import java.io.*;
class write2
{
	public static void main(String args[])
	{
	try
	{
		FileOutputStream fos= new FileOutputStream("C:\\kinjal\\java\\text2.txt");
		fos.write(65);
		fos.close();
	}catch (Exception e)
	{
		System.out.println("error");
	}
	}
}