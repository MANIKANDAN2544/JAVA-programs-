import java.util.Scanner;
class StringLengthDemo
{
public static void main(String[] arr)
{
String st;
int i=0;
char[] ch;
Scanner sc=new Scanner(System.in);
st=sc.next();
ch=st.toCharArray();
for(char c: ch)
{
i++;
}
System.out.println(i);
}
}


