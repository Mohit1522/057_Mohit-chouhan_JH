class pyramidpattern5
{
public static void main(String args[])
{
for(int i=9;i>=0;i--)
{
for(int j=i;j>0;j--)
{
System.out.print("  ");
}
for(int j=9;j>=i;j--)
{
System.out.print(j+" ");
}

for(int j=9;j>i;j--)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}