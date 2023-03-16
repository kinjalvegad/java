import java.io.*;
class write3
{
	public static void main(String args[])throws Exception
	{
		String s="hello java";
		FileOutputStream fos= new FileOutputStream("C:\\kinjal\\java\\text3.txt");
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
	}
}