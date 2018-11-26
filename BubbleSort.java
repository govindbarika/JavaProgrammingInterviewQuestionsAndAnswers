package com.example.demo;

import java.util.stream.IntStream;

public class BubbleSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static void bubbleSort(Integer[] arr) {
        IntStream.range(0, arr.length - 1)
                .flatMap(i -> IntStream.range(0, arr.length - 1 - i))
                .filter(j -> arr[j] > arr[j + 1])
                .forEach(j -> {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                });
    }

}
