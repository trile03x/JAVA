import java.util.*;
public class BAI04 {
    static int cau1(String str)
    {
        String[] brr = str.split("\\s+");
        int size = brr.length;
        System.out.println(size);
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        System.out.println(temp);
        return size;
    }
    static void cau3()
    {
         System.out.println("* Two strings");
         Scanner sc = new Scanner(System.in);
         String str1 = sc.nextLine();
         String str2 = sc.nextLine();
         if(str1.indexOf(str2)==-1)
         {
             System.out.println("Substring not found in the string");
         }
         else 
          System.out.println("Substring found at position "+str1.indexOf(str2)+" in the string");
    }
    static void cau2(String str)
    {
        String[] brr = str.split("\\s+");
        System.out.println("- The third character "+brr[2]);
    }
    static void cau4(String str)
    {
        String[] brr = str.split("\\s+");
        int tnumber=0;
        int tna=0;
        int tpa =0;
        int tc =0;
        for(int i=0;i<brr.length;i++)
        {
            if(brr[i].matches("\\d+")||brr[i].matches("(-?\\d+\\.\\d++)?"))
                    {
                        tnumber++;
                    }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("- Enter a string");
         String str = sc.nextLine();
         int kt = cau1(str);
         if(kt>3)
         {
             cau2(str);
         }
         else
         {
             System.out.println("N/A");
         }
         cau3();
         cau4(str);
      
    }
    
}
