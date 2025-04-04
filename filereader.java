import java.io.*;
class read
{
    public static void main(String p[])
    {
        try {
            FileReader fr=new FileReader("c:\\drashti\\java\\home.txt");
            int i;
            while ((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }
            fr.close();
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}


/* This is home file. */
