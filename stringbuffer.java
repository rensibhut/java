class strbfr
{
    public static void main(String p[])
    {
        StringBuffer str=new StringBuffer("Loginius");
        System.out.println("Print String : "+str);
        str.append(" Infotech");
        System.out.println("Appdend Data into String : "+str);
        str.insert(0,"COMPANY Name : ");
        System.out.println("Insert At POSITION 0 : "+str);
        str.replace(0,6,"Company");
        System.out.println("Replace COMPANY to Company : "+str);
        str.delete(0,16);
        System.out.println("Delete 'Company Name : ' String"+str);
    }
}

/* Print String : Loginius
Appdend Data into String : Loginius Infotech
Insert At POSITION 0 : COMPANY Name : Loginius Infotech
Replace COMPANY to Company : CompanyY Name : Loginius Infotech
Delete 'Company Name : ' StringLoginius Infotech */