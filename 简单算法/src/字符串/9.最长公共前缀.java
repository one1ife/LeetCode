package 字符串;

/**
 * @Author Jacky Zou
 * @Date 2022/4/6 9:15
 * @Version 1.0
 */
class demo9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        String[] strs = new String[]{"alower","flow","flight"};
        String s = solution9.longestCommonPrefix(strs);
        System.out.println(s);
    }
}

//纵向扫描
class Solution9 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer str = new StringBuffer("");
        for(int i = 0;i < strs[0].length();i++) {
            if (prepare(strs, i)) {
                str.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return str.toString();
    }

    public boolean prepare(String[] strs,int index){
        try {
            for (int i = 1;i < strs.length;i++){
                if(strs[i].charAt(index) != strs[i - 1].charAt(index)){
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}