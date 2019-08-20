import java.util.Scanner;
class StringExam
{
public static void main(String[] ars)
{
String str1;
int i=0,count=0;
Scanner sc=new Scanner(System.in);
str1=sc.nextLine();
for(i=0;i<str1.length();i++)
{
char ch=str1.charAt(i);
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
{
count++;
}
}
System.out.println(count);
}
}