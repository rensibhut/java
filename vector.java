import java.util.*;  
class vector
{
    public static void main(String p[])
    {
        Vector< String > v=new Vector< String >();
        v.add("BCA");
        v.add("BSCIT");
        v.add("BBA");
        v.add("BCOM");
        System.out.println("Data Of VECTOR : "+v);
        System.out.println("Size of Vector : "+v.size());
        System.out.println("Capacity of Vector : "+v.capacity());
        System.out.println("Remove of Vector : "+v.remove("BBA"));
        System.out.println("Data Of VECTOR AFTER REMOVE : "+v);
    }
}

/* Data Of VECTOR : [BCA, BSCIT, BBA, BCOM]
Size of Vector : 4
Capacity of Vector : 10
Remove of Vector : true
Data Of VECTOR AFTER REMOVE : [BCA, BSCIT, BCOM] */