package Leetcode;

public class question2_7 {
    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "129";
        System.out.println(addStrings(num1, num2));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while(i >= 0 || j >= 0 || add != 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}