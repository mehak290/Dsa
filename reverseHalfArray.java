public class reverseHalfArray {
    public static void reverseHalfArray(int [] arr){
        int left=0;
        int mid=(arr.length/2)-1;
        while(left<mid){
            int temp=arr[left];
            arr[left]=arr[mid];
            arr[mid]=temp;
            mid--;
            left++;
        }
    }
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6};
        reverseHalfArray(arr);
        for(int num:arr){
            System.out.print(num+"  ");
        }
    }
}
