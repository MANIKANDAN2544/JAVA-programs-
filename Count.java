import java.util.Scanner;
class Count
{
int a,count=0;
public void Sum()
{
while(a>0)
{
a=a/10;
count++;
}
System.out.println(count);
}
public static void main(String[] args)
{
Count ob=new Count();
Scanner sc=new Scanner(System.in);
ob.a=sc.nextInt();
ob.Sum();
}
}