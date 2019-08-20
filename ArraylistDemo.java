import java.util.ArrayList;
import java.util.ListIterator;
class ArraylistDemo
{
public static void main(String[] arg)
{
ArrayList<String> arr=new ArrayList<String>();
String s1= new String("hello");
String s2=new String("world");
String s3=new String("welcome");
String s4=new String("java");
System.out.println("size before adding"+arr.size());
arr.add(s1);
arr.add(s2);
arr.add(s3);
arr.add(s4);
System.out.println("size after adding"+arr.size());
System.out.println("size"+arr);
arr.remove(3);
arr.remove(s1);
System.out.println("size after removing"+arr.size());
System.out.println("size"+arr);
ListIterator i=arr.listIterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}