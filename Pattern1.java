public class  Pattern1
{
public static void main(String[] args)
{
    System.out.println("Hello");
    System.out.println("1.==========");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 
    System.out.println("2.==========");

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 
    System.out.println("3.==========");

    
    for(int i=1;i<=5;i++)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 
    
    
    System.out.println("4.==========");

    for(int i=1;i<=5;i++)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    } 
    System.out.println("5.==========");

    for(int i=1;i<=5;i++)
    {
        for(int k=4;k>=i;k--)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++)
        {
            System.out.print("*");
        }
        System.out.println();
    } 

    System.out.println("6.==========");
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    } 
    
    System.out.println("7.==========");

    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    } 

    System.out.println("8.==========");

    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print("*");
        }
        System.out.println();
    } 

    System.out.println("9.==========");

    for(int i=5;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    } 

    System.out.println("10.==========");
    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print(" *");
        }
        System.out.println();
    } 

    System.out.println("11.==========");

    for(int i=1;i<=5;i++)
    {
        for(int k=1;k<=i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=(5-i);j++)
        {
            System.out.print("*"+ " ");
        }
        System.out.println();
    } 

    System.out.println("12.==========");
    int k=0;
    for(int i=0;i<4;i++)
    {

        for(int j=0;j<i+1;j++)
        {
            k++;
            System.out.print(k+" ");

        }
        System.out.println();

    }



    } 
    
}
