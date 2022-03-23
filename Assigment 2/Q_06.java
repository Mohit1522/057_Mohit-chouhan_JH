import java.util.Scanner;
class Q_06
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
Integer i = sc.nextInt();

System.out.println("enter the second number");
Integer j = sc.nextInt();

int k,l,m,n,o;
System.out.println("sum of the numbers is "+ (k = (i+j)));
System.out.println("diffrence of the numbers is " + (l=(i-j)));
System.out.println("multiply of the numbers is " +( m=(i*j)));
System.out.println("quotient of the numbers is " + (n=(i/j)));
System.out.println("remainder of the numbers is " + (o=(i%j)));

}
}
