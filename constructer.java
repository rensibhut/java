class spr1
{
    spr1()
    {
        System.out.println("THIS IS SPR1 CLASS");
    }
    public static void main(String s[])
    {
        new spr1().demo();
    }
    public static void demo()
    {
        System.out.println("THIS IS DEMO");
    }
}


/* PS C:\diya\java> javac constructer.java
PS C:\diya\java> java spr1
THIS IS SPR1 CLASS
THIS IS DEMO */
