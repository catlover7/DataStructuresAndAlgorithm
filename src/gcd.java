
import java.util.Scanner;

/**
 * @author 韩志伟
 * @Description 求最大公约数 辗转相除法
 * @create 2021-09-02-10:15
 */
public class gcd{
    public static int main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入m");
        int m = scanner.nextInt();
        System.out.println("请输入n");
        int n=scanner.nextInt();
        int r=m%n;
        while (( r=m%n)!=0){
            m=n;
            n=r;
            r=m%n;

        }
return n;
    }

    public static void main(String[] args) {
        main();
    }
}
