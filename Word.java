import java.util.Scanner;
class Word
{
public static void main(String[] args)
{
String st,sch;
char[] ch;

int length=0,sum=0;
Scanner sc=new Scanner(System.in);
st=sc.nextLine();
ch=st.toCharArray();
sch=sc.nextLine();
for(char c: ch)
{
length++;
}
for(int a=length-1;a>=0;a--)
{
if(st.charAt(a)==sch.charAt(0))
{
sum++;
}
}
System.out.println(sum);
}
} 