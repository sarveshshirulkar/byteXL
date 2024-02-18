import java.util.Scanner;

public class monkey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int banana = m / k;
        int peanuts = p / j;
        int total = banana + peanuts;
        int left = n - total;
        System.out.println(left);
    

    }    
}
        
