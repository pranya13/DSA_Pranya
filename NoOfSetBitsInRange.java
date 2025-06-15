import java.util.Scanner;

public class NoOfSetBitsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range: ");
        int n = sc.nextInt();
        int num = n;
        int tsb = 0;
        for(int j=1; j<=n;j++){
        int i = j;
        while(i>0){
            if((1&i) == 1){
                tsb+=1;
            }
                i=i>>1;
        }
    }    
        System.out.println("Total number of set  bits in given range (1 to "+ num + ") = "+tsb);
        sc.close();
    }
}
