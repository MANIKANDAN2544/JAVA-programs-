import java.util.Scanner;
class VowelException extends RuntimeException
{
public VowelException()
{
System.out.println("Its a vowel try again!");
}
}
public class VowelCheck
{
public static void main(String[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
try
{
throw new VowelException();
}
catch (VowelException e)
{
System.out.println("exception raise");
}
}
else
{
System.out.println("its not vowel"+ch);
}
}
} 
