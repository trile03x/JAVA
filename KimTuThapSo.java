import java.util.Scanner;
public class BAI03 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int x, input;
	for(int i = 1; i <= n; i++) {
	    for(int j = 0; j <= 2 * n; j++) {
	        x = j - n;
		if(x < 0) {
		x *= -1;
	    }
	    input = i - x;
		if(input > 0) {
			System.out.printf("%3d", input);
		}else {
			System.out.printf("   ");
		}
			}
			System.out.println();
        }
    }
}
