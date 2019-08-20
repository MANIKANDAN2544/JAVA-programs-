import java.util.Scanner;
class RevExam
{
public static void main(String[] args)
{
String str1;
int i;
Scanner sc=new Scanner(System.in);
str1=sc.nextLine();
String str2="";
for(i=str1.length()-1;i>=0;i--)
{
str2=str2+str1.charAt(i);
}
System.out.println(str2);
}
}
