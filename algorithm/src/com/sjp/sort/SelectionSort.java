package com.sjp.sort;

import com.sjp.base.BaseOperation;

import java.util.Arrays;

/**
 * @Author: sjp
 * @Date : Created in 2020/5/29
 * @Description:选择排序
 * 1.在未排序序列中选出最小（大）的值，放在起始位置
 * 2.在剩下未排序列中选出最小（大）的值，放在已排序列右边
 * 3.重复步骤2直接排序完成
 */

public class SelectionSort extends BaseOperation {

    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a=new int[]{1,3,9,2,6,4};
        SelectionSort selectionSort = new SelectionSort();
        int[] sort = selectionSort.sort(a);
        for (int i : sort) {
            System.out.print(i);
        }
    }
}
