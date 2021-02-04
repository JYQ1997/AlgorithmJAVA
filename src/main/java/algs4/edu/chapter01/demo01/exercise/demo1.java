package algs4.edu.chapter01.demo01.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author YongQiang
 * @Date 2020/7/26 15:18
 * @Version 1.0
 */
public class demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //以下是颜色一
        map.put("黑色", "30");
        map.put("红色", "31");
        map.put("绿色", "32");
        map.put("黄色", "33");
        map.put("蓝色", "34");
        map.put("紫红色", "35");
        map.put("青蓝色", "36");
        map.put("白色", "37");
        //以下比颜色一更鲜艳

        map.put("黑色", "90");
        map.put("红色", "91");
        map.put("绿色", "92");
        map.put("黄色", "93");
        map.put("蓝色", "94");
        map.put("紫红色", "95");
        map.put("青蓝色", "96");
        map.put("白色", "97");

        String hightColor = "\033[1;36m";
        String endColor = "\033[0m";
/*
        //1.1.1
        //给出以下表达式的值
        System.out.println("(0+15)/2 = " + hightColor + (0 + 15) / 2 + endColor);
        System.out.println("2.0e-6*10000000.1 = " + hightColor + 2.0e-6 * 10000000.1 + endColor);
        System.out.println("true && false || true && true = " + hightColor + (true && false || true && true) +
                endColor);
*/
/*
        //1.1.2
        //给出以下表达式的类型和值
        System.out.println("(1+2.236)/2 = " + hightColor + (1 + 2.236) / 2 + endColor);
        System.out.println(" 1+2+3+4.0 = " + hightColor + (1+2+3+4.0) + endColor);
        System.out.println("4.1>=4 = " + hightColor + (4.1>=4) + endColor);
        System.out.println("1+2+\"3\" = " + hightColor + (1+2+"3") + endColor);
        */

/*
        //1.1.5
        //编写一段程序，如果double类型的变量x,和y都严格位于0和1之间，则打印true，否则,打印false
        betweenZeroAndOne(0.000000000000001,0.5);
*/
/*
        //1.1.6
        //下面这段程序会打印出什么
        forPrint();
*/

        //1.1.7
        double t=9.0;
        while (Math.abs(t-9.0/t)>.001){
            t=(9.0/t+t)/2.0;
        }
        System.out.printf("%.5f\n",t);

    }
    public static void betweenZeroAndOne(double x,double y){
        if (x>0&&x<1&&y>0&&y<1){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    public static void forPrint(){
        int f=0;
        int g=1;
        for (int i = 0; i < 15; i++) {
            System.out.println(f);
            f=f+g;
            g=f-g;
        }
    }
}
