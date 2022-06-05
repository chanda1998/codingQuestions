package com.firstprograms;

import java.util.ArrayList;

public class pascalTraingle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> row;
        ArrayList<Long> pre = null;
        for(int nr = 0; nr<n; ++nr){
            row = new ArrayList<>();
            for(int nc = 0; nc <=nr; ++nc){
                if(nc==0||nc==nr){
                    row.add(1L);
                }else {
                    row.add(pre.get(nc-1)+ pre.get(nc));
                }
            }
            ans.add(row);
            pre = row;
        }
        return  ans;
    }
}

