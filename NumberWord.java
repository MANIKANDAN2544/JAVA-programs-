import java.util.Scanner;
class NumberWords
{
public static void main(String[] arr)
{
String str1;
char[] ch;
int sum=0,i=0,x;
Scanner sc=new Scanner(System.in);
str1=sc.nextLine();
ch=str1.toCharArray();
for(char c: ch)
{
i++;
}
for(int a=0;a<i;a++)
{
if(str1.charAt(a)==''&&str1.charAt(a+1)!='')
{
sum++;
}
a++;
}
x=i-sum;
System.out.println(x);
}
} 