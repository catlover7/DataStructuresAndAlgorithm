/**
 * @author 韩志伟
 * @Description 快排
 * @create 2021-09-25-9:58
 */
public class QuickSortTest {
    static int[] arr=new int[]{3,2,90,-4,6,8,9,10,1};
    public static void main(String[] args) {

        QuickSort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    //left right 分别指左右两个端点
    public static void QuickSort(int[] arr,int left,int right){
        if(arr.length == 0||arr==null) {
            return;
        }
        //端点不可移动 设置两个指针l r , l满足arr[l]>key,停止向右遍历；r满足arr[r]<key 停止向左遍历
        //把左端点的值给key
        if(left>right){
            return;
        }
        int key=arr[left];
        //两个指针初始位置分别在左右两个端点
        int l=left;
        int r=right;
        //若 l=r 则需要与key对换位置 那么就形成以key为中心的左右两个数组 可以递归调用方法
        //l!=r 此时将arr[l]与 arr[r]对换
        while (l!=r){
            //等于符号不可删除 否则会出现几个一样的数
            while (arr[r]>=key&&l<r){
                r--;
            }
            while (arr[l]<=key&&l<r){
                l++;
            }
            if(l<r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        //l=r 则需要与key对换位置
        arr[left]=arr[l];
        arr[l]=key;

        //递归核心
        QuickSort(arr,left,l-1);
        QuickSort(arr,l+1,right);
    }
}
