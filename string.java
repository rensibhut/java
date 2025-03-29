class string1
{
    public static void main(String p[])
    {
        String s="Geetanjali College";
        System.out.println("Length of Geetanjali College: "+s.length());
        String s1="Geetanjali Bhavan";
        System.out.println("Geetanjali College and Geetanjali Bhavan (string) are same :  "+s.equals(s1));
        if(!s.isEmpty())
        {
            System.out.println("String s is Not Empty ");
        }
        System.out.println("Replace Bhavan To College : "+s1.replace("XYZ","LOGINIUS"));
        System.out.println("Conver 'Geetanjali College' to LOWER : "+s.toLowerCase());
        System.out.println("Conver 'Geetanjali Bhavan' to UPPER : "+s1.toUpperCase());
    }
}


/* Length of Geetanjali College: 18
Geetanjali College and Geetanjali Bhavan (string) are same :  false
String s is Not Empty
Replace Bhavan To College : Geetanjali Bhavan
Conver 'Geetanjali College' to LOWER : geetanjali college
Conver 'Geetanjali Bhavan' to UPPER : GEETANJALI BHAVAN */