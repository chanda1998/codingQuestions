package com.firstprograms;

import java.lang.reflect.Array;
import java.util.*;

public class nextPm {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        if(permutation.size() == 1) return permutation;
        if(permutation.size() == 2) {
            Collections.swap(permutation,0,1);
            return permutation;
        }
        int l = permutation.size()-2, r = permutation.size()-1;
        // search for first number greater than its next
        while(permutation.get(l) >= permutation.get(l+1)){
            l--;
            if(l == 0) break;
        }
        // search for first number from back which is greater than the nums[l]
        while(permutation.get(l) >= permutation.get(r)){
            r--;
            if(r == 0) break;
        }
        // swap them and reverse every number from l+1 to last of the array
        if(r!= 0)Collections.swap(permutation,l++,r);
        r = permutation.size()-1;
        while(l<r){
            Collections.swap(permutation,l++,r--);
        }
        return permutation;
    }
}
