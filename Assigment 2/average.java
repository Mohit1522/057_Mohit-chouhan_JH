import java.util.Scanner;
class average
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number");
Float n1 = sc.nextFloat();


System.out.println("enter the second number");
Float n2 = sc.nextFloat();


System.out.println("enter the third number");
Float n3 = sc.nextFloat();

float a =n1+n2+n3;
float b = a/3;


System.out.println("the average of "+ n1 +","+ n2 +" and "+ n3 +" is ="+b);
}

}