import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner c=new Scanner(System.in);
        int x,y;
        x=c.nextInt();
        y=c.nextInt();
        if((x==0 && y%2==0))
        {
            System.out.println("YES");
        }
        else if((x==0 && y%2!=0))
        {
            System.out.println("NO");
        }
        else if((x+(2*y))%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}