class Solution {
     public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != -1) {
                    flag = true;
                    min = Math.min(min, dp[i - coin]);
                }
            }
            if (flag) {
                dp[i] = min + 1;
            }
        }
        return dp[amount];
    }
}