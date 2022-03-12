class pattern13
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for(int j=i;j<5;j++)
{
System.out.print(" ");
}
if(i>0 && i<2)
{
for(int j=1;j<=i;j++)
{
System.out.print("A ");
}
}

if(i>1 && i<3)
{
for(int j=1;j<=i;j++)
{
System.out.print("B ");
}
}
if(i>2 && i<4)
{
for(int j=1;j<=i;j++)
{
System.out.print("C ");
}
}
if(i>3 && i<5)
{
for(int j=1;j<=i;j++)
{
System.out.print("D ");
}
}
if(i>4 && i<6)
{
for(int j=1;j<=i;j++)
{
System.out.print("E ");
}
}
System.out.println();
}
}
}