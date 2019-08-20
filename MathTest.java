import java.util.Scanner;
class MathTest
{
public float ans
public void result(int a,int b)
{
ans=a+b;
System.out.println(ans);
}
public void result(float a,int b)
{
ans=a*b;
System.out.println(ans);
}
public void result(int a,float b)
{
ans=a/b;
System.out.println(ans);
}
public void result(float a,float b)
{
ans=ab;
System.out.println(ans);
}
public static void main(String[] args)
{
int x,y;
float p,q;
MathTest ob=new MathTest();
Scanner sc=new Scanner(System.in);
System.out.println("value of 1 int ");
x=sc.nextInt();
System.out.println("value of 2 int ");
y=sc.nextInt();
System.out.println("value of 3 float");
p=sc.nextFloat();
System.out.println("value of 4 float");
q=sc.nextFloat();
ob.result(x,y);
ob.result(p,x);
ob.result(y,q);
ob.result(p,q);
}
}
