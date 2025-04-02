import java.util.*;  
class link
{
    public static void main(String p[])
    {
        LinkedList< String > l=new LinkedList<>();
        l.add("This");
        l.add("is");
        l.add("LINKEDLIST");
        l.add("EXAMPLE");
        System.out.println(l);
        System.out.println("Display Data using ITERATOR : ");
        Iterator< String > move=l.iterator();
        while(move.hasNext())
        {
            System.out.println(move.next());
        }

        System.out.println("Remove EXAMPLE from the LinkedList : ");
        l.remove("EXAMPLE");
        System.out.println(l);
        System.out.println("Display in DESC ORDER : ");
        Iterator move1=l.descendingIterator();  
        while(move1.hasNext())
        {
            System.out.println(move1.next());
        } 
    }
}


/* [This, is, LINKEDLIST, EXAMPLE]
Display Data using ITERATOR :
This
is
LINKEDLIST
EXAMPLE
Remove EXAMPLE from the LinkedList :
[This, is, LINKEDLIST]
Display in DESC ORDER :
LINKEDLIST
is
This */