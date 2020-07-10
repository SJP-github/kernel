package com.sjp.sort;

import com.sjp.base.BaseOperation;

/**
 * @Author: sjp
 * @Date : Created in 2020/6/2
 * @Description: 冒泡排序
 * 时间复杂度O(n^2)
 * 空间复杂度O(n)
 * 稳定性：稳定
 */

public class BubbleSort extends BaseOperation {

    @Override
    public int[] sort(int[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length-i-1; j++) {
                if (source[j] > source[j+1]) {
                    swap(source,j,j+1);
                }
            }
        }
        return source;
    }

    public static void main(String[] args) {
        int[]  a=new int[]{1,9,2,6,5,4,7};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.sort(a);
        for (int i : sort) {
            System.out.print(i);
        }
    }
}
