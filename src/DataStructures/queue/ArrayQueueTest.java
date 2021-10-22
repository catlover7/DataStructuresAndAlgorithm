package DataStructures.queue;

import java.util.Scanner;

/**
 * @author 韩志伟
 * @Description
 * @create 2021-08-29-17:17
 */
public class ArrayQueueTest {
    public static void main(String[] args) {
//        ArrayQueue arrayQueue = new ArrayQueue(5);
//        Boolean empty = arrayQueue.isEmpty();
//        System.out.println(empty);
//        boolean isfull = arrayQueue.isfull();
//        System.out.println(isfull);
//      //  arrayQueue.addQueue(0);
//        arrayQueue.show();
        //测试一把
        //创建一个队列
        ArrayQueue queue = new ArrayQueue(10);
        char key = ' '; //接收用户输入
        Scanner scanner = new Scanner(System.in);//
        boolean loop = true;
        //输出一个菜单
        while(loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            key = scanner.next().charAt(0);//接收一个字符
            switch (key) {
                case 's':
                    queue.show();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g': //取出数据
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h': //查看队列头的数据
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e': //退出
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }

        System.out.println("程序退出~~");
    }
}
class ArrayQueue{
    private int MaxSize;//数组的长度
    private int front;// 指向数组的首部的位置
    private int rear;// 指向数组尾部
    private int[] arr;// 数组
    //初始化构造器
    public ArrayQueue(int MaxSize){
        this.MaxSize=MaxSize;
        //错误格式 int[] arr=new int[this.MaxSize];这样的化就new了不同的对象 上面已经声明变量了
        arr = new int[this.MaxSize];
        int rear=-1; //指向数组的尾部的数据
        int front=-1;//指向首部前一个的位置

    }
    //判断空
    public Boolean isEmpty(){
        return front==rear;
    }
    //判断队列满
    public boolean isfull(){
        return rear==MaxSize-1;
    }
    //添加 队列
    public void addQueue(int n){
        if(isfull()){
            System.out.println("队列已经满了，不可以添加了");
            return;
        }
            rear++;//让rear后移
            arr[rear]=n;

    }
    //获取删除的值
    public int getQueue(){
        if(isEmpty()){
            throw new RuntimeException("1没有数据");
        }else {
            front++;
           return arr[front];

        }
    }
    public void show(){
        if(isEmpty()){
            System.out.println("为空没有数据");

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("arr[%d]==%d\n",i,arr[i]);
        }

    }
    public int headQueue() {
        // 判断
        if (isEmpty()) {
            throw new RuntimeException("队列空的，没有数据~~");
        }
        return arr[front + 1];
    }
}
