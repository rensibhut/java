import java.util.*;
import java.io.*;
class write
{
    public static void main(String p[])
    {
        try {
            File f=new File("c:\\drashti\\java\\home.txt");
            FileWriter w = new FileWriter(f);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Text : ");
            String nm=sc.nextLine();
            w.write(nm);
            w.flush();
            System.out.println("Data inserted!");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}


/* Enter Text :
This is home file.
Data inserted! */
