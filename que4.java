import java.util.Scanner;

public class que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int calc(int x){
            if(x==1){
                System.out.println(x);
            }
            else{
                System.out.println(calc(x-1)+calc(x-2));
            }

        }
        int count(n){
            
        }


    }
}
