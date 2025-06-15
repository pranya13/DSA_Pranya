
import java.util.Scanner;

public class FibonacciSeries {
    int fibonacci(int n){
        if(n<=1){
            return n;
        }
    return fibonacci(n-2)+fibonacci(n-1);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        FibonacciSeries f = new FibonacciSeries();
        System.out.println("Fibonacci series: ");
        for(int i =0; i<n; i++){
            System.out.print(f.fibonacci(i) + " ");
            
        }
        sc.close();
    }
}
