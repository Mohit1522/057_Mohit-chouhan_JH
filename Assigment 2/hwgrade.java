import java.util.Scanner;
class hwgrade
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks");
int i = sc.nextInt();

if(i<50)
{
System.out.println("you are fail!!!");
}
else if(i>=50 && i<60)
{
System.out.println("D");
}

else if(i>=60 && i<70)
{
System.out.println("C");
}

else if(i>=70 && i<80)
{
System.out.println("B");
}

else if(i>=80 && i<90)
{
System.out.println("A");
}

else if(i>=90 && i<100)
{
System.out.println("A+");
}
else
{
System.out.println("invalid entery");
}

}

}
