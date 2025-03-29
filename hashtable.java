import java.util.*;  
class hash
{
    public static void main(String p[])
    {
        Hashtable< String,String > h=new Hashtable< String,String >();
        h.put("Name","Bhut Rensi");
        h.put("Address","Sardar chowk,Kotda Sangani");
        h.put("Contact No","6359906666");
        h.put("Age","19");
        System.out.println("Data of Hashtable : "+h);
        h.put("Address","Sardar chowk,Kotda Sangani,Rajkot");
        System.out.println("Data of Hashtable after updated using key : "+h);
        System.out.println("Display Data Using MAP : ");
        for(Map.Entry dir:h.entrySet())
        {
            System.out.println("Key : "+dir.getKey()+" , Value : "+dir.getValue());
        }
        h.remove("Address");
        System.out.println("Display After Remove : "+h);
    }
}

/* Data of Hashtable : {Name=Bhut Rensi, Contact No=6359906666, Age=19, Address=Sardar chowk,Kotda Sangani}
Data of Hashtable after updated using key : {Name=Bhut Rensi, Contact No=6359906666, Age=19, Address=Sardar chowk,Kotda Sangani,Rajkot}
Display Data Using MAP :
Key : Name , Value : Bhut Rensi
Key : Contact No , Value : 6359906666
Key : Age , Value : 19
Key : Address , Value : Sardar chowk,Kotda Sangani,Rajkot
Display After Remove : {Name=Bhut Rensi, Contact No=6359906666, Age=19} */