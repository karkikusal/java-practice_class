
//prime number or not;

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        int num,k,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A Number");
        num =s.nextInt();
        k=1;
        n=0;
        while(k<= num)
        {
            if((num%k)==0)
                n=n+1;
            k++;
        }
        if(n==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}



