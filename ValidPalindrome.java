/*
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class validPalindrome {

    public static void main(String args[]) {
        String s = "A man, a plan, a canal: Panama";
        validPalindrome obj = new validPalindrome();
        boolean ans = obj.isPalindrome(s);
        System.out.println(ans); 
    }
    public boolean isPalindrome(String s) {
    int start = 0;
    int end = s.length()-1;
    char chStart;
    char chEnd;
    while(start < end){
        chStart = s.charAt(start);
        chEnd = s.charAt(end);
        if(!Character.isLetterOrDigit(chStart)){
            start++;
        }
        else if(!Character.isLetterOrDigit(chEnd)){
            end--;
        }
        else if(Character.toLowerCase(chStart) == Character.toLowerCase(chEnd)){
            start++;
            end --;
        } else{
            return false;
        }
    }
    return true;
	}
}