
public class BinarySearch {
   static int binarySearch(int[] arr, int target){
      int high = arr.length -1;
      int low = 0;
      
      while(high>=low){
         int mid = low + (high-low)/2;
         if(arr[mid] == target){
            return mid;
         }else if(target > arr[mid]){
            low = mid+1;
         }else if(target<arr[mid]){
            high = mid-1;
         }
      }
      return -1;

   }
   public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,10,15};
        int target = 9;
        int result = binarySearch(arr, target);
        System.out.println(result);

   } 
}
