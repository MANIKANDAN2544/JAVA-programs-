import java.util.TreeSet;
import java.util.Iterator;
class TreeSetDemo
{
public static void main(String[] ags)
{
TreeSet<Integer> tree=new TreeSet<Integer>();
Integer i1=new Integer(4);
Integer i2=new Integer(2);
Integer i3=new Integer(5);
System.out.println(tree.size());
tree.add(i1);
tree.add(i2);
tree.add(i3);
System.out.println(tree.size());
System.out.println(tree);
tree.remove(i3);
System.out.println(tree.size());
System.out.println(tree);
Iterator i=tree.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}