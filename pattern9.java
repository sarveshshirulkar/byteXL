public class pattern9 {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==j || i==0 || j==1 || i == 5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            
            }
            System.out.println();
        }
    }
}
