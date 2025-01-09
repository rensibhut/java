class spr2
{
    spr2()
    {
        System.out.println("THIS IS SPR2 CLASS");
    }
    spr2(String a)
    {
        System.out.println("NAME= "+a);
    }
    public static void main(String s[])
    {
        spr2 a=new spr2();
        a=new spr2(s[0]);
    }
}