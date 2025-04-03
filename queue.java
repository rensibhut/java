import java.util.*;
class queue
{
    public static void main(String p[])
    {
        PriorityQueue q = new PriorityQueue<>();
        q.add("This");
        q.add("is");
        q.add("Example");
        q.add("of");
        q.add("Queue");
        System.out.println("Display Data : "+q);
        Iterator i = q.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        q.remove();
        q.poll();
        System.out.println("Display After Remove two Elements : ");
        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


/* Display Data : [Example, Queue, This, of, is]
Example
Queue
This
of
is
Display After Remove two Elements :
This
is
of */