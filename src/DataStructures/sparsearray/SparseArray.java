package DataStructures.sparsearray;

import java.util.Arrays;

/**
 * @author 韩志伟
 * @Description 稀疏数组
 * @create 2021-08-28-15:49
 */
public class SparseArray {
    public static void main(String[] args) {
        //原来的二维数组
        System.out.println("原来的二维数组");
        int[][] arr = new int[11][11];
        //1表示白子 ，2表示蓝字
        arr[1][2] = 1;
        arr[3][4] = 2;
        //原始的数组
        int sum = 0;
        for (int[] row : arr) {

            // int length = row.length;
            // System.out.println(length);
            //获取arr数组中每一行的地址 二维数组两次遍历
            // System.out.println(row);
            for (int item : row) {

                System.out.printf("%d\t", item);
                if (item > 0) {
                    sum = sum + 1;
                }
            }
            System.out.println();
            //System.out.println(sum);

        }
        System.out.println("***********************");
        System.out.println(sum);
        // int[sum+1][3];
        //根据sum值获取稀疏数组行列值
        int[][] sparsearray = new int[sum + 1][3];
        //s创建对应的稀疏数组
        sparsearray[0][0]=11;
        sparsearray[0][1]=11;
        sparsearray[0][2]=sum;
        System.out.println("稀疏数组的长度"+sparsearray.length);
        //遍历二维数组，将不为o的值存放到sparsearray中
        int count=0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                if(arr[i][j]!=0){
                    count++;
                    sparsearray[count][0]=i;
                    sparsearray[count][1]=j;
                    sparsearray[count][2]=arr[i][j];
                }

            }
        }
        System.out.println();
        System.out.println("得到的稀疏数组为");
        for (int[] row :sparsearray) {

            // int length = row.length;
            // System.out.println(length);
            //获取arr数组中每一行的地址 二维数组两次遍历
            // System.out.println(row);
            for (int item : row) {

                System.out.printf("%d\t", item);

            }
            System.out.println();
        }

        System.out.println("*********************");
        System.out.println("稀疏数组转变为二维数组");
        //获取稀疏数组有几行几列 以及有几个值 先创建二维数组
        int[][] sparsetotwo=new int[11][11];

        for (int i = 1; i <sparsearray.length ; i++) {


            sparsetotwo[sparsearray[i][0]][sparsearray[i][1]]=sparsearray[i][2];

        }

        System.out.println();
        for (int[] row :sparsetotwo) {


            for (int item : row) {

                System.out.printf("%d\t", item);

            }
            System.out.println();
        }


    }
}
