import java.util.*;
class stack
{
    public static void main(String p[])
    {
        Stack< String > s=new Stack<>();
        s.push("This");
        s.push("is");
        s.push("Data");
        s.push("of");
        s.push("Stack");
        System.out.println("Display Data of Stack: ");
        System.out.println(s);
        System.out.println("Remove last Data (pop) : ");
        s.pop();
        System.out.println(s);
        String data=s.peek();
        System.out.println("Peek Data is : "+data);
        System.out.println("Empty : "+s.empty());
        System.out.println("Size : "+s.size());
    }
}


/* Display Data of Stack:
[This, is, Data, of, Stack]
Remove last Data (pop) :
[This, is, Data, of]
Peek Data is : of
Empty : false
Size : 4 */