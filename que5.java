import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {
        int val[] = {6,7,1,3,8,2,5};
        int sum = 0;
        for(int i=0;i<=val.length;i+=2){
                if(val[i]>val[i+1]){
                    sum += val[i];
                    // System.out.println(sum);
                }
                System.out.println(sum);

        }

    }   
}
