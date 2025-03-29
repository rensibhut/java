import java.util.StringTokenizer;
class token
{
    public static void main(String p[])
    {
        StringTokenizer token = new StringTokenizer("Hello, This is our Rangilu Rajkot"," ");
        System.out.println("Total Token : "+token.countTokens());
        while(token.hasMoreTokens())
        {
            System.out.println(token.nextToken());
        }
    }
}

/* Total Token : 6
Hello,
This
is
our
Rangilu
Rajkot */