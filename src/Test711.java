/**
 * @author 韩志伟
 * @Description
 * @create 2021-09-09-20:45
 */
public class Test711 {
    public static void main(String[] args) {
  
//美国有一个连锁店叫做711店，将四个数乘起来为7.11，加起来也是7.11求这四个数
        //通过检测三次循环比四次明显快很多
        int number=1;
        for(double x=2;x<711;x++) {
            for(double y=1;y<711-x;y++) {
                for(double z=1;z<711-x-y;z++){
//					for(int w=1 ;w<711;w++) {
//						if ((x*y*z*w)==711000000&&(x+y+z+w)==711) {
//							System.out.println("x="+x+",y="+y+",z="+z+",w="+w);
//						}
//					}
                    number++;
                    double w=711-x-y-z;
                    if ((x*y*z*w)==711000000&&(x+y+z+w)==711) {
                        System.out.println("寻找次数为： "+number);
                        System.out.println("x="+(x/100)+",y="+(y/100)+",z="+(z/100)+",w="+(w/100));
                    }
                }
            }
        }
    }
}


