public class smallestElement {
    public static void main(String[] args){
        int[] arr={70,20,30,4,50};
        int min =arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]) min=arr[i];
        }
        System.out.println("Smallest element is "+min);
    }
}
