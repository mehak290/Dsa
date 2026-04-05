import java.util.Arrays;

public class runningSumOfArray{
    public static int[] runningSum(int[] arr){
        int[] runningSum= new int[arr.length];
        if(arr.length == 0) return runningSum;
        runningSum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            runningSum[i]=runningSum[i-1]+arr[i];
        }
        return runningSum;
    }}
class Main{
    public static void main(String[] args){
        int[] arr= {1,2,3,4};
        int[] result = runningSumOfArray.runningSum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
