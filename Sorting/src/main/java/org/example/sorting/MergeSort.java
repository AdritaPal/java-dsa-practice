package org.example.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray,0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    private static void mergeSort(int[] intArray, int start, int end) {
        if(end - start < 2){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(intArray,start,mid);
        mergeSort(intArray,mid,end);
        merge(intArray,start,mid,end);
    }

    private static void merge(int[] intArray, int start, int mid, int end) {
        if (intArray[mid-1]<=intArray[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while (i<mid && j<end){
            temp[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
        }
        System.arraycopy(temp,0,intArray,start,tempIndex);

    }
}
