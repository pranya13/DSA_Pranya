import java.util.Arrays;
import java.util.Scanner;

public class missingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n-1; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Missing element-");
        for(int i=1; i<n; i++){
            if(Arrays.binarySearch(nums, i) <0 ){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
