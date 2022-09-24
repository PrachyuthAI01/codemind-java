import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt(),d,r=0,p=1;
        int di;
        while(n!=0)
        {
            d=n%10;
            r=r+d;
            p=p*d;
            n=n/10;
        }
        di=p-r;
        System.out.println(di);
    
    }
}