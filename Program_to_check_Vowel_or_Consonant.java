import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner c = new Scanner(System.in);
        char s=c.next().charAt(0);
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
        {
            System.out.printf("Vowel");

        }
        else
        {
            System.out.printf("Consonant");
        }
    }
}