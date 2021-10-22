/**
 * @author 韩志伟
 * @Description编写程序,求n至少为多大时,n个1组成的整数能被2013整除
 * @create 2021-09-03-14:09
 */
public class n1 {
    public static void main(String[] args){
        int n = 1;
        int a = 1;
        while (true) {
            if (n % 2013 == 0) {
                break;
            } else {
                n = (n % 2013) * 10 + 1;
                a += 1;
            }
        }
        System.out.println(a+"个1组成的整数能被2013整除");
    }

}
