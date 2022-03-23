import java.util.Scanner;
class Q8
{
public static void main(String args[])
{
Scanner od= new Scanner(System.in);
System.out.println("enter the number");
int n= od.nextInt();
int r;
while(n>0)
{
r=n%10;
System.out.println(r);
n=n/10;
}
}
}



