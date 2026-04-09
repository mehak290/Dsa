public class StringPalindrome {
    public static boolean palindrome(String s){
        int left=0;
        int right=s.length()-1;
        if(s.length()==0) return true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
               }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s="madam";
        System.out.println(palindrome(s));
        String s2="hello";
        System.out.println(palindrome(s2));
    }
}
