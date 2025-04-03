import java.util.*;
class map
{
    public static void main(String p[])
    {
        Map< String , String > m=new HashMap< String , String >();
        m.put("Name1","xyz");
        m.put("Name2","abc");
        m.put("Name3","pqr");
        System.out.println(m);
        for(Map.Entry data: m.entrySet())
        {
            System.out.println(data);
        }
    }
}


/* {Name3=pqr, Name1=xyz, Name2=abc}
Key :Name3 ,Value :pqr
Key :Name1 ,Value :xyz
Key :Name2 ,Value :abc */