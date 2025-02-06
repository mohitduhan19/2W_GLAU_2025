package W.Lec3_Lab;

public class Buy_Sell_Stock {
    public int help(int[] nums , int i , int buy){
        if(i >= nums.length)return 0;

        int l = 0 , r = 0 , d = 0 , x = 0;
        //buy
        if(buy == 1){
            l =  -nums[i] + help(nums , i + 1 , 0);
            x =  help(nums , i + 1 , 1);
            return Math.max(l , x);
        }else{
            r = nums[i] + help(nums , i + 1 ,1);
            d =  help(nums , i + 1 , 0);
            return Math.max(r , d);
        }
    }
    public int maxProfit(int[] prices) {
        return help(prices , 0 , 1);

    }
}
