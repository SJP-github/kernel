package com.sjp;

import com.sjp.sort.QuickSort;

/**
 * @Author: sjp
 * @Date : Created in 2020/5/29
 * @Description:
 */

public class Test {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int [] arr=new int[]{3,6,9,11,1,7,8,3};
        int[] sort = quickSort.sort(arr);
        for (int i : sort) {
            System.out.println(i);
        }
    }
}
