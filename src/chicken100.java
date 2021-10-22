/**
 * @author 韩志伟
 * @Description 百块钱买百只鸡共公5母3 子 1/3
 * @create 2021-09-03-14:12
 */
public class chicken100 {
    public static void main(String[] args) {
        //i表示公个数 ，j母个数
        //公鸡可以买上线
        for (int i = 0; i <19 ; i++) {
            for (int j = 0; j <33 ; j++) {
              int k=100-i-j;
                   if((5 * i + 3 * j + k/3 == 100 )&&k%3==0){
                       System.out.println("公鸡:"+i+ "母鸡" +j+ "	 雏鸡：" +k);


                   }

            }
        }
    }
}
