import java.util.Scanner;
class Vowels
{
public static void main(String[] args)
{
String st;
char[] ch;
int length=0,lenth=0,sum=0;
Scanner sc=new Scanner(System.in);
st=sc.nextLine();
ch=st.toCharArray();
for(char c:ch)
{
length++;
}
for(int a=length-1;a>=0;a--)
{
if(st.charAt(a)=='a'||st.charAt(a)=='e'||st.charAt(a)=='i'||st.charAt(a)=='o'||st.charAt(a)=='u'||st.charAt(a)=='A'||st.charAt(a)=='E'||st.charAt(a)=='I'||st.charAt(a)=='O'||st.charAt(a)=='U')
{
sum++;
}
}
System.out.println("number of vowels"+sum);
}
}