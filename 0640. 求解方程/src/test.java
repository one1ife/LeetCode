public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.solveEquation("2x+3x-6x=x+2");
        System.out.println(s);

    }
}
class Solution {
    public String solveEquation(String equation) {
        int left = 0;
        int right = 0;
        char c = '-';
        for (int i = 0; i < equation.length(); i++) {
            if(equation.charAt(i) == '=') c = '+';
            if(equation.charAt(i) >= '0' && equation.charAt(i) <= '9' && (i == equation.length() - 1 || equation.charAt(i + 1) != 'x')){
                if(i == 0 | equation.charAt(i - 1) == '+' || equation.charAt(i - 1) == '='){
                    right += Integer.parseInt(c + ""  + equation.charAt(i));
                }else if(equation.charAt(i - 1) == '-'){
                    right -= Integer.parseInt(c + ""  + equation.charAt(i));
                }
            }

            if(equation.charAt(i) == 'x'){
                if(i == 0){
                    left++;
                } else if (equation.charAt(i - 1) >= '0' && equation.charAt(i - 1) <= '9') {
                    if(i == 0 | equation.charAt(i - 1) == '+' || equation.charAt(i - 1) == '='){
                        right += Integer.parseInt(c + ""  + equation.charAt(i));
                    }else if(equation.charAt(i - 1) == '-'){
                        right -= Integer.parseInt(c + ""  + equation.charAt(i));
                    }
                } else {
                    if(i == 0 | equation.charAt(i - 1) == '+' || equation.charAt(i - 1) == '='){
                        left += Integer.parseInt(c + ""  + equation.charAt(i));
                    }else if(equation.charAt(i - 1) == '-'){
                        left -= Integer.parseInt(c + ""  + equation.charAt(i));
                    }
                }
            }
        }
        if(left == right) return "Infinite solutions";
        return "x=" + right / left;
    }
}