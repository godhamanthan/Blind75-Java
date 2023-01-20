// using for loop and runtime 2 ms
class Solution{
    public int maxProfit(int[]prices){
        int minval = Integer.MAX_VALUE;
        int maxpro = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minval){
                minval = prices[i];
            }else if(prices[i]-minval>maxpro){
                maxpro = prices[i]-minval;
            }
        }
        return maxpro;
    }
}

// using dp
class Solution {
    public int maxProfit(int[] prices) {
        return maximumProfit(prices,0,1,1,new HashMap<String,Integer>());
    }
    private int maximumProfit(int[]prices,int currDay,int canBuy, int transCount,HashMap<String,Integer>memo){
        if(currDay>=prices.length || transCount==0)
        return 0 ;


        int ans=0;
        String currKey = currDay + "-" + canBuy + "-" + transCount;
        if(memo.containsKey(currKey))
        return memo.get(currKey);
        if(canBuy==1){
            int idle = maximumProfit(prices,currDay+1,canBuy,transCount,memo);
            int buy = -prices[currDay]+maximumProfit(prices,currDay+1,0,transCount,memo);
            return ans= Math.max(idle,buy);
        }
        else{
            int idle= maximumProfit(prices,currDay+1,canBuy,transCount,memo);
            int sell = prices[currDay]+maximumProfit(prices,currDay+1,1,transCount-1,memo);
            memo.put(currKey, ans= Math.max(idle,sell));
            return ans = Math.max(idle,sell);
        }
    }
}
