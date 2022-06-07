package com.firstprograms;

import java.util.ArrayList;

public class BuySellStock {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int maxProfit = 0;
        int minValue = prices.get(0);
        for(int i = 1;i<prices.size();i++){
            maxProfit = Math.max(prices.get(i) - minValue,maxProfit);
            minValue = minValue<prices.get(i) ? minValue:prices.get(i);

        }
        return maxProfit;
    }
}
