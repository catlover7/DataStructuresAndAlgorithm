/**
 * @author 韩志伟
 * @Description 冒泡排序
 * @create 2021-09-25-9:35
 */
public class BubbleSort {
    public static void main(String[] args) {
      int[] arrays={5,3,0,-2,10,1,4,22};
      BSort(arrays);
      for(int a:arrays){
          System.out.println("a = " + a);
      }
    }
    public static void BSort(int[] arr){
// n个数组元素遍历n-1次
        for (int i = 0; i <arr.length-1 ; i++) {
            //每次遍历中 已经排序好的数不需要在每次遍历中使用，实际上只遍历arr.length-i个数据 ，-1是n个数组元素遍历n-1次
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }


    }
}
