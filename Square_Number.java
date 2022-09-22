import java.util.Scanner;
class sn
{
    public static void main(String args[])
    {
        Scanner c = new Scanner(System.in);
        int n=c.nextInt(),d=0;
        double s;
        for(int i=0;i<=(int)Math.sqrt(n);i++)
        {
            for(int j=0;j<=(int)Math.sqrt(n);j++)
            {
                if((i*i)+(j*j)==n)
                {
                    d=d+1;   
                }
                else
                {
                    continue;
                }
            }
        }
        if(d==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}