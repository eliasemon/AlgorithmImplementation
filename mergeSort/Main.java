package com.company;

public class Main {
    public  static void merge(int[] arr,int lb,int mid,int hb){
        int arrBLen = hb-lb+1;
        int[] arrB = new int[arrBLen];
        int i = lb;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= hb){
            if(arr[i] <= arr[j]){
                arrB[k] = arr[i];
                i++;
            }else{
                arrB[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid){
            for (;j <= hb;j++ ){
                arrB[k] = arr[j];
                k++;
            }
        }else{
            for (;i <= mid;i++ ){
                arrB[k] = arr[i];
                k++;
            }
        }
        i = lb;
        for (k = 0;k < arrBLen;k++,i++){
            arr[i] = arrB[k];
        }
    }
    public static void mergeSort(int[] arr,int lb,int hb){
        if(lb < hb){
            int mid = (lb + hb)/2;
            mergeSort(arr,lb,mid);
            mergeSort(arr,mid+1,hb);
            merge(arr,lb,mid,hb);
        }
    }

    public static void main(String[] args) {
	    int[] arr = {10, 3,14,17,-4,12,-3,16,19,70,-3};
	    int len = arr.length;
//        System.out.println(len);
        mergeSort(arr,0,len-1);
        for (int temp: arr) {
            System.out.println(temp);
        }
    }
}
