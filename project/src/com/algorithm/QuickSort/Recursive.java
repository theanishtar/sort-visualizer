/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm.QuickSort;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Recursive {
    public static int partion(int[] array,int low,int high){
        int tmp = array[low];
        while(low<high){
            while(low < high && array[high] >= tmp){
                --high;
            }
            if(low >= high){
                break;
            }else{
                array[low] = array[high];
            }
            while(low < high && array[low] <= tmp){
                ++low;
            }
            if(low >= high){
                break;
            }else{
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        return low;
    }
    public static void Quick(int[] array,int start,int end){
        int par = partion(array,start,end);
        if(par > start+1){
            Quick(array, start, par-1);
        }
        if(par < end-1){
            Quick(array, par+1, end);
        }
    }
    public static void QuickSort(int[] array){
        Quick(array,0,array.length-1);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {45,12,46,5,13,47,2};
        QuickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
