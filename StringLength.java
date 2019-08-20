import java.util.Scanner;
class StringLength
{
public static void main(String[] args)
{
char[] ch=new char[10];
int i=0;
int a=0;
int sum=0;
Scanner sc=new Scanner(System.in);
while(i<10)
{
ch[i]=sc.next().charAt(i);
if(ch[i]=='\0')
{
break;
}
sum++;
a++;
}
System.out.println(sum);
}
}
