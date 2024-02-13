package com.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
        int[] array = {1,2,3,4,5};
        String[] strArray = {"ABC","xyz","mno"};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("2nd index value is : "+array[2]);

        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

//        array[5]=6;
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
        System.out.println(array.length);



    }
}
