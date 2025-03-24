package W.Lec6_Lab;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int water = 0;
        int[] lm = new int[height.length];
        int[] rm = new int[height.length];

        lm[0] = height[0];
        for(int i = 1; i < height.length;i++){
            lm[i] = Math.max(height[i] , lm[i-1]);
        }
        rm[height.length-1] = height[height.length-1];
        for(int i = height.length -2;i >= 0;i--){
            rm[i] = Math.max(height[i] , rm[i+1]);
        }

        for(int i = 1;i < height.length-1;i++){
            water += Math.min(rm[i] , lm[i]) - height[i];
        }
        return water;
    }
}
