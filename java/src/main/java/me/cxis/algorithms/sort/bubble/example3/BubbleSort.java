package me.cxis.algorithms.sort.bubble.example3;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * @param source 待排序数组
     * @param asc 是否升序 true：升序（从小到大）false：降序（从大到小）
     */
    public void bubbleSort(Integer[] source, boolean asc) {
        // 标志位
        boolean exchange = true;
        for (int i = 1; i < source.length && exchange; i++) {
            exchange = false;
            for (int j = 0; j < source.length - i; j++) {
                if (asc ? source[j] > source[j + 1] : source[j] < source[j + 1]) {
                    Integer temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                    exchange = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] {38, 55, 65, 97, 27, 76, 27, 13, 19};
        System.out.println("before: " + Arrays.asList(array));
        new BubbleSort().bubbleSort(array, true);
        System.out.println("after: " + Arrays.asList(array));
    }
}
