package com.firstprograms;

public class largeSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        long max = arr[0];
        long sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        return max>0?max:0;
    }
}
