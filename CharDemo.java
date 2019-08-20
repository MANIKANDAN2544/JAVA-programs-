import java.util.Scanner;
class CharDemo
{
public static void main(String[] arg)
{
char ch;
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
ch=sc.next().charAt(i);
}
for(int i=0;i<10;i++)
{
System.out.println(ch[i]);
}
}
}
 