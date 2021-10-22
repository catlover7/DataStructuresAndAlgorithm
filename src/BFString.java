/**
 * @author 韩志伟
 * @Description 模式串匹配bf算法
 * @create 2021-09-09-19:39
 */
public class BFString {
    public static void main(String[] args) {
        String str="ababcabccabcacbab";
        String sub="abcac";
        int bfstring = Bfstring(str, sub);
        System.out.println(bfstring);
    }

    /**
     *
     * @param str 主串
     * @param sub 模式串
     * @return 若j=substr.length 模式串遍历完成有返回值则 返回i-j; 否则返回 -1；
     */
    public  static int Bfstring(String str, String sub){
        char[] charstr = str.toCharArray();
        char[] substr = sub.toCharArray();
        int i=0;
        int j=0;
        while (i<charstr.length&&j<substr.length){//循环条件 不满足条件退出
            if(substr[j] == charstr[i]){ // 对模式串每个字符匹配
                j++;
                i++;
            }
            else {
                i=i-j+1;
                j=0; //只要一个不匹配 不成功 则模式串从头开始匹配
            }
        }
        if(j==substr.length)
            return i-j;
        else return -1;
    }
}

