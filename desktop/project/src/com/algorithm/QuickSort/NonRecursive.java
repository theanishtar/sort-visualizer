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
public class NonRecursive {

    public static int partion(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                --high;
            }
            if (low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while (low < high && array[low] <= tmp) {
                ++low;
            }
            if (low >= high) {
                break;
            } else {
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        System.out.println("Array (low): ");
        System.out.println(Arrays.toString(array));
        return low;
    }

    public static void QuickSort(int[] array) {
        int[] stack = new int[array.length];
        System.out.println("Stack: ");
        int top = 0;
        int low = 0;
        int high = array.length - 1;
        int par = partion(array, low, high);
        // push into the stack
        if (par > low + 1) {
            stack[top++] = low;
            stack[top++] = par - 1;
        }
        if (par < high - 1) {
            stack[top++] = par + 1;
            stack[top++] = high;
        }
        //Unstack
        while (top > 0) {
            high = stack[--top];
            low = stack[--top];
            par = partion(array, low, high);
            //Re-enter the stack
            if (par > low + 1) {
                stack[top++] = low;
                stack[top++] = par - 1;
            }
            if (par < high - 1) {
                stack[top++] = par + 1;
                stack[top++] = high;
            }
        }
        //System.out.println(Arrays.toString(stack));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {5, 8, 4, 3, 6, 7};
        QuickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
