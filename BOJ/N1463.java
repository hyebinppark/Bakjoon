package com.company.bakjoon;

import java.util.Scanner;

public class N1463 {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 0;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+1;
            if(i%3==0) dp[i] = Math.min(dp[i/3]+1, dp[i]);
            if(i%2==0) dp[i] = Math.min(dp[i/2]+1, dp[i]);
        }

        System.out.print(dp[n]);
    }
}