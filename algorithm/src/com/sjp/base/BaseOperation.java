package com.sjp.base;

/**
 * @Author: sjp
 * @Date : Created in 2020/5/29
 * @Description:
 */

public class BaseOperation {

    /**
     * 排序
     * @param source
     * @return
     */
    public int[] sort(int[] source) {
        return source;
    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
