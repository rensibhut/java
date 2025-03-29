import java.util.*;
class cal
{
    public static void main(String p[])
    {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("HOUR OF DAY : "+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("DATE : "+cal.get(Calendar.DATE));
        System.out.println("MINUTE : "+cal.get(Calendar.MINUTE));
        System.out.println("TIMEZONE : "+cal.getTimeZone().getDisplayName());
    }
}

/* HOUR OF DAY : 16
DATE : 29
MINUTE : 46
TIMEZONE : India Standard Time */