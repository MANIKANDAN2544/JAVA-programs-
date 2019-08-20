import java.util.Scanner;
class TwoStrings
{
public static void main(String[] args)
{
String st,sch;
char[] ch,hc;
int length=0,lenth=0,sum=0;
Scanner sc=new Scanner(System.in);
st=sc.nextLine();
ch=st.toCharArray();
sch=sc.nextLine();
hc=sch.toCharArray();
for(char c: ch)
{
length++;
}
for(char dc: hc)
{
lenth++;
}
if(length==lenth)
{
for(int a=length-1;a>=0;a--)
{
if(st.charAt(a)==sch.charAt(a))
{
sum++;
}
}
}
else
{
System.out.println("two strings are not same");
}
if(sum==length)
{
System.out.println("two strings are same");
}
else
{
System.out.println("two strings are not same");
}
}
} 