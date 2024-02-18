import java.util.Scanner;

public class paintCost {
    public static void main(String[] args) {
        float totSAE = 0;
        float totSAI = 0;
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        for(int i=0;i<x;i++){
            float SAI = sc.nextFloat();
            totSAI = totSAI+SAI;
        }
        for(int i=0;i<y;i++){
            float SAE = sc.nextFloat();
            totSAE = totSAE+SAE;
        }
        float cost =0;
        cost = totSAE*12 + totSAI*18;
        System.out.println(cost+ "INR");
        
        sc.close();

    }
}
