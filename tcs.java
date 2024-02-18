import java.util.Scanner;

public class tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wt = sc.nextInt();
        if(wt==0){
            System.out.println("0 min");
        }
        else if(wt>0 && wt<=2000){
            System.out.println("25 minutes");

        }
        else if (wt >= 4000){
            System.out.println("35 minutes ");
        }
        else if (wt >= 7000){
            System.out.println("45 minutes ");
        }
        else{
            System.out.println("INVALID");
        }



    }
    
}
