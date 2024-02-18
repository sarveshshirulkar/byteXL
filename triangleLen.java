public class triangleLen {
    public static void main(String[] args) {
        
        long a = 4;
        long b = 3;
        long c = 5;
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
