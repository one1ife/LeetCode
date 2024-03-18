public class test {
    public static void main(String[] args) {

    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = 0;
        boolean b = false;
        while (length < s.length()){
            if(s.charAt(s.length() - 1 - length) != ' '){
                b = true;
            }else if(!b){
                i++;
            }else {
                break;
            }
            length++;

        }
        return length - i;

    }
}
