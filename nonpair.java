public class nonpair {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int res = 0;
        for(int i=0; i<arr.length; i++){
            res^=arr[i];
        }
        System.err.println(res);
    }
}
