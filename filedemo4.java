import java.io.*;
public class filedemo4 
{
    public static void main(String argc[])
    {
        File dir=new File("c:\\kinjal\\java");
        File files[]=dir.listFiles();
        System.out.println("File\t canWrite\t is hidden \t size");
        for(File file:files)
        {
            System.out.println(file.getName()+"\t"+file.canWrite()+"\t"+file.isHidden()+"\t"+file.length()+"bytes");
        }
    }
}
/*File     canWrite        is hidden       size
filedemo1.class true    false   717bytes
filedemo1.java  true    false   355bytes
filedemo2.class true    false   1093bytes
filedemo2.java  true    false   529bytes
filedemo3.java  true    false   657bytes
filedemo4.class true    false   1100bytes
filedemo4.java  true    false   433bytes
inputputstreamwriter1.java      true    false   416bytes
javafile123.text        true    false   0bytes
output.txt      true    false   10bytes
outputstreamwrite1.class        true    false   681bytes
outputstreamwriter1.class       true    false   682bytes
outputstreamwriter1.java        true    false   381bytes
read5.class     true    false   773bytes
read5.java      true    false   375bytes
read6.class     true    false   769bytes
read6.java      true    false   363bytes
textfile1.txt   true    false   0bytes
write1.java     true    false   187bytes
write4.class    true    false   654bytes
write4.java     true    false   345bytes
write5.class    true    false   566bytes
write5.java     true    false   354bytes */
