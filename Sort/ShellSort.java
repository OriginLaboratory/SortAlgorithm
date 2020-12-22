/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ê±Óê
 */
public class ShellSort {
     public static int[] ShellSort(int[] array) {
    int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
     }
     public static void main(String[] args){
         int a[]={23,4,5,6,67,7,8,9,10};
         int b[]=ShellSort.ShellSort(a);
         for(int i=0;i<a.length;i++)System.out.println(a[i]+"\n");
     }
}
