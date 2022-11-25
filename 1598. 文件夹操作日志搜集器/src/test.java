public class test {

}
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String s : logs){
            if(s.startsWith("./")){

            }else if (s.startsWith("../")){
                if(depth!=0) depth--;
            }else {
                depth++;
            }
        }
        return depth;
    }
}