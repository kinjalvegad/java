import java.io.*;
public class filedemo3
{
    public static void  main(String argc[])
    {
        File f=new File("c:\\kinjal\\java");
        String filenames[]=f.list();
        for(String filename:filenames)
        {
            System.out.println(filename);
        }      
    }
}
/*filedemo1.class
filedemo1.java
filedemo2.class
filedemo2.java
filedemo3.java
inputputstreamwriter1.java
javafile123.text
output.txt
outputstreamwrite1.class
outputstreamwriter1.class
outputstreamwriter1.java
read5.class
read5.java
read6.class
read6.java
textfile1.txt
write1.java
write4.class
write4.java
write5.class
write5.java */