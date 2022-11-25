package 排序和搜索;

class demo02{
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int i = solution.firstBadVersion(2126753390);
        System.out.println(i);
    }
}
//二分查找
class Solution2{
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(isBadversion(mid)){
                end = mid;
            }else {
                start = mid + 1;
            }
        }

        return start;
    }

    boolean isBadversion(int i){
        if (i >= 1702766719) return true;
        return false;
    }

}
