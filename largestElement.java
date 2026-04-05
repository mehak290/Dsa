public class largestElement{
    public static void main(String [] args){
        int[] arr= {10,20,30,0,50};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        System.out.println("Largest Element => "+ max);
    }
}