public class reverString {
    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
        char ch=s[left];
        s[left]=s[right];
        s[right]=ch;
        left++;
        right--;
        }
    }
    public static void main(String[] args){
        char []s={'h','e','l','l','o'};
        reverseString(s);
        for(int ch=0;ch<s.length;ch++){
            System.out.print(s[ch]+" ");
        }
    }
}

