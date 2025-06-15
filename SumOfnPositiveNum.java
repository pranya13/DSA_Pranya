import java.util.Scanner;

public class SumOfnPositiveNum {
    static int SumofN(int n){
        if(n==0) return 0;
        return n+SumofN(n-1);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        System.out.println(SumofN(n));
        sc.close();
    }
}
