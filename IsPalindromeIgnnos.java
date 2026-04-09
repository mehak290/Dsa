public class IsPalindromeIgnnos {
    public static boolean palindromeCheck(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(left<right && !Character.isLetter(s.charAt(left))){
                left++;
            }
            if(left<right && !Character.isLetter(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s="a1b2c3b4a5";
        System.out.println(palindromeCheck(s));
    }
}
