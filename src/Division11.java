/**
 * @author 韩志伟
 * @Description判断一个大整数能否被11整除
 * @create 2021-09-09-20:38
 */
public class Division11 {

    public boolean division11(long num) {
        int r = 0 ;
        String str = new String();
        str = Long.toString(num);
        for(int i = str.length() - 1; i >= 0; i --) {
            int temp = Integer.valueOf(str.charAt(i)).intValue();
            //对奇数位偶数位的计算
            if (i % 2 == 0) {
                r += temp;
            }else {
                r += temp * 10;
            }
        }
        if (r % 11 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Division11 div11= new Division11();
        long num =562843748 ;
        System.out.println(div11.division11(num));

    }


}
