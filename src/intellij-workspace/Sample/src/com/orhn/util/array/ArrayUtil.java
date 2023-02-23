package com.orhn.util.array;

import java.util.Random;

public class ArrayUtil {
    public ArrayUtil()
    {}

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }

    public static void fillRandomArray(Random r, int [] a, int min, int bound)
    {
        for(int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(min, bound);
    }

    public static int [] join(int [] a, int [] b)
    {
        int [] result = new int[a.length + b.length];

        int idx = 0;

        for (int val : a)
            result[idx++] = val;

        for (int val : b)
            result[idx++] = val;

        return result;
    }

    public static int [] getRandomArray(Random r, int count, int min, int bound)
    {
        int [] a = new int[count];
        fillRandomArray(r, a, min, bound);
        return a;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int val : a)
            total += val;

        return total;
    }

    public static void reverse(int [] a)
    {
        for (int i = 0; i < a.length / 2; ++i)
            swap(a, i, a.length - i - 1);
    }

    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);

        System.out.printf("%n---------------------------------------%n");
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for ( int ival : a)
            System.out.printf(fmt, ival);

        System.out.println();
    }
}

