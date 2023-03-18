/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class SimulationQuickSort {
    
    public static List<Quick> list = new ArrayList<>();

    static void quickSort(int[] a, int L, int R) {
        if (L >= R) {
            return;
        }
        //B1. Chon khoa
        int key = a[(L + R) / 2];
        //B2. Phan bo lai mang theo khoa
        int k = partition(a, L, R, key);

        //System.out.println("L = " + L + " R = " + R + " pivot = " + key + " k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        //System.out.println("-----------------");

        //B3. Chia doi mang => Lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    static void sort(List<Integer> list, int L, int R) {
        if (L >= R) {
            return;
        }

        int key = list.get((L + R) / 2);

        int k = getPivot(list, L, R, key);
        
        //System.out.println("L = " + L + " R = " + R + " pivot = " + key + " k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(list.toArray(), L, R + 1)));
        System.out.println("-----------------");
        
        //add note
        SimulationQuickSort.list.add(new Quick(false, k, -1, -1, L, R, -9999, -9999));
        
        sort(list, L, k - 1);
        sort(list, k, R);
    }
    
    static List<Quick> note(){
        List<Quick> list = new ArrayList<>();
        return list;
    }

    static int getPivot(List<Integer> list, int L, int R, int key) {
        int iL = L;
        int iR = R;
        
        SimulationQuickSort.list.add(new Quick(false, -9999, iL, iR, L, R, -9999, -9999));
        while (iL <= iR) {
            while (list.get(iL) < key) {
                iL++;
                SimulationQuickSort.list.add(new Quick(false, -9999, iL, iR, L, R, -9999, -9999));
            }
            while (list.get(iR) > key) {
                iR--;
                SimulationQuickSort.list.add(new Quick(false, -9999, iL, iR, L, R, -9999, -9999));
            }
            if (iL <= iR) {
                //swap(a[iL], a[iR])
                int temp = list.get(iL);
                list.set(iL, list.get(iR));
                list.set(iR, temp);
                System.out.println("Swap(" + iL + "-" + iR + ")");
                System.out.println("^"+Arrays.toString(list.toArray()));
                
                //add note
                SimulationQuickSort.list.add(new Quick(true, -9999, -9999, -9999, -9999, -9999, iL, iR));
                iL++;
                iR--;
            }
        }
        return iL;
    }

    static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            while (a[iL] < key) {
                iL++;
            }
            while (a[iR] > key) {
                iR--;
            }
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                //System.out.println("Swap(" + iL + "-" + iR + ")");
                //System.out.println("^"+Arrays.toString(a));
                iL++;
                iR--;
            }
        }
        return iL;
    }

    // Driver program
    public static void main(String args[]) {
        /*
        int arr[] = {6, 7, 8, 5, 4, 1, 2, 3};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        System.out.println("Start");

        quickSort(arr, 0, n - 1);

        System.out.println("sorted array");

        System.out.println(Arrays.toString(arr));
*/

        System.out.println("---------List----------");
        List<Integer> list = new ArrayList<>();

        list.add(62);
        list.add(69);
        list.add(40);
        list.add(6);
        list.add(77);
        list.add(0);
        list.add(4);
        list.add(88);
        
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Start");
        System.out.println("List Length: "+SimulationQuickSort.list.size());
        sort(list, 0, list.size()-1);
        System.out.println("Sorted: "+ Arrays.toString(list.toArray()));
        System.out.println("List Length: "+SimulationQuickSort.list.size());

    }
}
