/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithm.QuickSort;

/**
 *
 * @author ADMIN
 */
public class Quick {
    boolean swap;
    int pivot;
    int i;
    int j;
    int start;
    int end;
    int x;
    int y;
    
    

    

    public Quick(int pivot, int start, int end) {
        this.pivot = pivot;
        this.start = start;
        this.end = end;
    }
    
    

    public Quick(boolean swap, int pivot, int i, int j, int start, int end, int x, int y) {
        this.swap = swap;
        this.pivot = pivot;
        this.i = i;
        this.j = j;
        this.start = start;
        this.end = end;
        this.x = x;
        this.y = y;
    }

    public Quick(int i, int j, int start, int end) {
        this.i = i;
        this.j = j;
        this.start = start;
        this.end = end;
    }

    public Quick(boolean swap, int x, int y) {
        this.swap = swap;
        this.x = x;
        this.y = y;
    }
    
    

    public Quick(boolean swap, int pivot, int i, int j, int start, int end) {
        this.swap = swap;
        this.pivot = pivot;
        this.i = i;
        this.j = j;
        this.start = start;
        this.end = end;
    }
    
    

    public Quick(int pivot, int i, int j, int start, int end) {
        this.pivot = pivot;
        this.i = i;
        this.j = j;
        this.start = start;
        this.end = end;
    }

    public Quick() {
    }

    public boolean isSwap() {
        return swap;
    }

    public void setSwap(boolean swap) {
        this.swap = swap;
    }

    public int getPivot() {
        return pivot;
    }

    public void setPivot(int pivot) {
        this.pivot = pivot;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
