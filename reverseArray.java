class reverseArray{
    public static void reverseArray(int[] arr,int left,int right){
        if(arr.length=0 || left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr,left+1,right-1);
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        reverseArray(arr,0,arr.length-1);
        for( int num: arr){
           System.out.print(num+" "); 
        }
    }
}