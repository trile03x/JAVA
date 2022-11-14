import java.util.Scanner;
public class BAI06 {
    static int check(int n )
    {
        if(n==2){
            return 1;
        }
        else{
           for (int i = 2; i < n; i++) 
           {
              if (n % i == 0) {
              return 0;
              }
              else
              {
                return 1;
              }
           }
        }
        return 0;
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int KQ = check(n);
        if(KQ==0)
        {
            System.out.println("- Khong phai la so nguyen to");
        }
        else {
            System.out.println("- La so nguyen to");
        }
        System.out.println("- Cac uoc nguyen to cua "+ n);
        for(int i =2;i<=n;i++)
        {
          while(n%i==0)
          {
              System.out.println(i);
              n=n/i;
          }
        }
        
        System.out.println("100 so nguyen to dau tien la : ");
        int count = 1;
        int i =1;
        while(count<=100)
        {
            int KQ3 = check(i);
            if(KQ3==1)
            {
               System.out.println("\t"+"So nguyen to thu "+count+" : "+i);
               count++;
            }
            i++;
        }
    }
}
