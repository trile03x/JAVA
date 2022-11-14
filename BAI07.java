import java.util.Scanner;
public class BAI07 {
     static int check(long n )
    {
        long  sum =0;
        for(int i =1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum+i;
            }
        }
        if(sum==n)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n =  sc.nextLong();
        int KQ = check(n);
        if(KQ==0)
        {
            System.out.println("- Khong phai la so hoan hao");
        }
        else {
            System.out.println("- La so hoan hao");
        }
        System.out.println(n+" So hoan hao dau tien la : ");
        long count = 1;
        long i =1;
        while(count<=n)
        {
            int KQ3 = check(i);
            if(KQ3==1)
            {
               System.out.println("\t"+"So hoan hao thu "+count+" : "+i);
               count++;
            }
            i++;
        }
    }
}
