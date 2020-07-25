package com.base.util.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author YongQiang
 * @Date 2020/5/28 13:15
 * @Version 1.0
 */
public class ArrayTest {

    public static void main(String[] args) {

        /**
         * 返回由指定数组支持的固定大小的列表。 （将返回的列表更改为“写入数组”。）该方法作为基于数组和基于集合的API之间的桥梁，与Collection.toArray()相结合 。 返回的列表是可序列化的，并实现RandomAccess 。
         * 此方法还提供了一种方便的方式来创建一个初始化为包含几个元素的固定大小的列表：
         * public static <T> List<T> asList(T... a)
         */

        /*//用法一
        List<String> list=Arrays.asList("sd","fg","hth");
        for (String s : list) {
            System.out.println("s = [" + s + "]");
        }
        //用法二
        String[] arrays={"qw","we","rt"};
        list=Arrays.asList(arrays);
        for (String s : list) {
            System.out.println("s = [" + s + "]");
        }*/


        /**
         * 根据指定数组的内容返回哈希码
         * public static int hashCode(int a[])
         *按照数字顺序排列指定的数组。
         * public static void sort(int[] a)
         */
        /*int[] intarray={12,45,75,25,56};
        int intHash=Arrays.hashCode(intarray);
        System.out.println(intHash);
        Arrays.sort(intarray);
        for (int i = 0; i < intarray.length; i++) {
            System.out.println("intarray["+i+"] = [" + intarray[i] + "]");
        }*/

        /**
         * 比较器的使用
         */
        /*String[] stringArray={"gf","sd","rg","af","pk","os"};
        Arrays.sort(stringArray,new StringComparator());
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray["+i+"] = [" + stringArray[i] + "]");
        }*/

        int[] intarray={12,45,75,25,56};
        IntStream intStream=Arrays.stream(intarray);
        System.out.println("intStream = [" + intStream.toString() + "]");

    }
}

class StringComparator implements Comparator<String>{

    /**
     * 返回一个数字(负整数，0，正整数)，分别代表o1<o2,o1=o2,o1>o2。
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2)>0){
            //o1.compareTo(o2)>0即o1>o2,但是我们返回-1，系统会判o1<o2,所以o1会排在前面，实现降序。
            return -1;
        }
        else if (o1.compareTo(o2)<0){

            return 1;
        }
        return 0;
    }
}
