class Snap
{
int a=5;
public void Chat()
{
System.out.println("hey hellow");
}
}
class Streak extends Snap
{
int a=10;
public void Chat() 
{
System.out.println("java");
}
public void display()
{
System.out.println(super.a);
System.out.println(a);
super.Chat();
Chat();
}
public static void main(String[] args)
{
Streak ob=new Streak();
ob.display();
}
}