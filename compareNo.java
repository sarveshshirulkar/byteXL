import java.util.Scanner;

public class compareNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int a = 3;
        // int b = 4;
        if(a>b){
            System.out.println("a is greater");
        }
        else if(a<b){
            System.out.println("b is greater");
        }
        else {
            System.out.println("a nd b are equal");
        }
        sc.close();
    }
    
}
