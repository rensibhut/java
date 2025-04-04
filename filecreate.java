import java.io.*;
class create
{
    public static void main(String p[])
    {
        try {
            File f=new File("c:\\drashti\\java\\home.txt");
            if(f.createNewFile())
            {
                System.out.println("File Created.");
            }
            else
            {
                System.out.println("File Already Exist.");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}


/* File Created.*/
