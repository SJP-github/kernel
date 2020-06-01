package com.sjp.sort;

import com.sjp.base.BaseOperation;

import java.util.Arrays;

/**
 * @Author: sjp
 * @Date : Created in 2020/6/1
 * @Description: 插入排序
 * 1.已下标为0的数据为起始参照点
 * 2.从下标为1的数据开始，在已排序的数列中从后往前扫描找到合适的位置插入
 */

public class InsertSort extends BaseOperation {

    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);

        //将下标为1的元素选择合适的位置插入，将下标为0的元素作为参照
        for (int i = 1; i < arr.length; i++) {
            //记录要插入的数据
            int tmp = arr[i];
            //从已排序的数列的右边开始找，找出比他小的
            int j=i;
            while (j > 0&&tmp<arr[j-1]) {
                //将大的数据右移直到找到合适的位置
                arr[j] = arr[j - 1];
                j--;
            }
            if (i != j) {
                arr[j]=tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] s=new int[]{3,9,6,2,5,7};
        int[] sort1 = sort.sort(s);
        for (int i : sort1) {
            System.out.print(i);
        }
    }


}
