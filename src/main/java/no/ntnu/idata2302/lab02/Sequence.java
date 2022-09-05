/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;


import java.util.Arrays;

public class Sequence {

    private int capacity;
    private int length;

    private int[] array;

    public Sequence() {
        this.capacity = 100;
        this.length = length;
        this.array = new int[capacity];
    }


    public int getLength() {
        return this.length;
    }

    /**
     * Insert a new element at the end of the sequence.
     * @param item The element to insert.
     */
    public void insert(int item) {
        if (this.length == this.capacity) {
            this.capacity *= 2;
            // shorthand version of a for loop ( also more efficient )
            this.array = Arrays.copyOf(this.array, this.capacity);
        }
        this.array[this.length] = item;
        this.length++;
    }

    /**
     * If the array is less then or equal to 25% full, we shrink the array by half
     */
    public void remove() {
        if (this.length <= this.capacity / 4) {
            this.capacity /= 2;
            this.array = Arrays.copyOf(this.array, this.capacity);
        }
        // remove the last element of the array
        this.array[this.length - 1] = 0;
        this.length--;
    }

    /**
     * Returns the index of the element found, if multiple instances returns index of first one.
     * If element does not exist, returns -1.
     *
     * @param elem to be found
     * @return index of elem, -1 if no elem in Sequence
     */
    public int lookup(int elem) {
        int i = 0;
        while (i < this.length) {
            if (elem == this.array[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

}
