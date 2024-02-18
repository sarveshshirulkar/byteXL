import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int count =0;
        int N = sc.nextInt();
        int k = sc.nextInt();
        for(int i=1;i<=N;i++){
            if(N%i==0){
                // System.out.println(i);
                arr[i]=i;
                count += 1;  
                System.out.println(arr);              
            }
            // for(int j=0;j<=i;j++){
            // arr[]={i};
            // System.out.println(arr.toString());

            // if(i==k){
            // System.out.println(arr[k]);
            // }
        }
        sc.close();
        } 
        
    }
}
