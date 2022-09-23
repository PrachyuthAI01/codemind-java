import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner v = new Scanner(System.in);
        int n=v.nextInt(),d=0;
        while (n != 1) 
       {  
            if ( n% 5 == 0) 
            {  
                n /= 5;  
            } 
            else if (n % 3 == 0) 
            {  
                n /= 3;  
            } 
            else if (n % 2 == 0) 
            {  
                n /= 2;  
            } 
            else 
            {  
                    System.out.println("Not Ugly Number"); 
                    d = 1;  
                    break;  
            }
       }
            if (d==0)
	        { 
                System.out.println("Ugly Number");
            }
        
    }
}