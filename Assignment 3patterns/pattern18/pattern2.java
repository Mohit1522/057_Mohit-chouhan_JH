class pattern2
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=i;j<=i;j++)
{
System.out.print("A ");
}
if(i>1 && i<6)
{
for(int j=i;j<=i;j++)
{
System.out.print("B ");
}
}
if(i>2 && i<6)
{
for(int j=i;j<=i;j++)
{
System.out.print("C ");
}
}
if(i>3 && i<6)
{
for(int j=i;j<=i;j++)
{
System.out.print("D ");
}
}
if(i>4 && i<6)
{
for(int j=i;j<=i;j++)
{
System.out.print("E ");
}
}

System.out.println();
}
}
}