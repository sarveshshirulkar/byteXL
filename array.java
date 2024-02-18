import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int oxyLev = sc.nextInt();
        // int person = sc.nextInt();
        //int avg =0;
        int arr[][] = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
                // int person = sc.nextInt();
                // arr[i][j]= sc.nextInt();              
                    // int avg = (arr[0][0]+arr[1][0]+arr[2][0])/3;                   
                    // if(avg > 70){
                    //     System.out.println("Trainee " + j + " is fit");
                    // }
                    // else{
                    //     System.out.println("Trainee " + j + " is Unfit");
                    // }                             
            }
            int avg =0;
            int avg1 = (arr[0][0]+arr[1][0]+arr[2][0])/3;
            int avg2 = (arr[0][1]+arr[1][1]+arr[2][1])/3;
            int avg3 = (arr[0][2]+arr[1][2]+arr[2][2])/3;

            if(avg > 70){
                System.out.println("Trainee  is fit");
            }
            else{
                System.out.println("Trainee  is Unfit");
            }  
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close(); 
    }  
}