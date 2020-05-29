package com.sjp.sort;

import com.sjp.base.BaseOperation;

import java.util.Arrays;

/**
 * @Author: sjp
 * @Date : Created in 2020/5/29
 * @Description: 快速排序
 * 1.在数列中确定一个基准
 * 2.计算分区索引，重新排序数列，比基准小的放左边；比基准大的放右边
 * 3.递归排列基准左右两侧子序列
 */

public class QuickSort extends BaseOperation {

    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public int[] quickSort(int[] arr, int low, int hight) {
        if (low < hight) {
            //确定基准，计算分区
            int partition = partition(arr, low, hight);
            //递归排序
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, hight);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr,pivot,index-1);
        return index - 1;
    }

}
