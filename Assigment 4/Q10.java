import java.util.Scanner;
class Q10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("plss enter the number");
int n1=sc.nextInt();

System.out.println("plss enter the number");
int n2=sc.nextInt();

System.out.println("plss enter the number");
int n3=sc.nextInt();
if(n1<=n2 && n1<=n3)
{
System.out.println("smallest number="+n1);
}
if(n2<=n3 && n2<=n1)
{
System.out.println("smallest number="+n2);
}
if(n3<=n1 && n3<=n2)
{
System.out.println("smallest number="+n3);
}
}
}