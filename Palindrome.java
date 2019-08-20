import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{ 
String original, reverse = "";
char[] ch,y,z; 
int length=0,don=0,a;
Scanner in = new Scanner(System.in);   
System.out.println("Enter a string to check if it is a palindrome");  
original = in.nextLine();
ch=original.toCharArray();
for(char c: ch)
{
length++;
}
for ( int i = length - 1; i >= 0; i-- )  
{
reverse = reverse + original.charAt(i);  
}
for(a=0;a<length;a++)
{
if(original.charAt(a)==reverse.charAt(a))
{
don++;
}
}
if(don==length)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}  
}