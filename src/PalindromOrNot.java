public class PalindromOrNot {
    static void main() {
        String str = "ABCSBA";
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("FALSE");
                return;
            }
            left++;
            right--;
        }
        System.out.println("TRUE");
    }
}
