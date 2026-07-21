class Solution {
    public int trap(int[] height) {
        //calculate left max boundary = array
        int n = height.length; //size of array
        int leftMax[]= new int[n];//left max boundary array
        leftMax[0]=height[0];//first element of left max boundary array is same as height array
        for(int i=1;i<n;i++){//loop to calculate left max boundary array 
            leftMax[i] = Math.max(height[i], leftMax[i-1]);//left max boundary array is the maximum of the current height and the previous left max boundary
        }

        //calculate right max boundary = array
        int rightMax[]=new int[n];//right max boundary array
        rightMax[n-1]=height[n-1];//last element of right max boundary array is same as height array
        for(int i = n-2; i>=0; i--){//loop to calculate right max boundary array
            rightMax[i]= Math.max(height[i], rightMax[i+1]);//right max boundary array is the maximum of the current height and the next right max boundary
        }

        //loop
        int trappedWater=0;//variable to store the total trapped water
        for(int i = 0; i<n; i++){//loop through the height array
            //waterleel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);//water level is the minimum of the left max boundary and the right max boundary
            //trapped water = waterlevel - height[i]
            trappedWater += waterlevel - height[i]; //trapped water is the difference between the water level and the current height
        }
        return trappedWater;//return the total trapped water


        //  int n = height.length;

        // if(n == 0) return 0;

        // int[] leftMax = new int[n];
        // int[] rightMax = new int[n];

        // leftMax[0] = height[0];

        // // Left Max
        // for(int i = 1; i < n; i++){
        //     leftMax[i] = Math.max(height[i], leftMax[i-1]);
        // }

        // rightMax[n-1] = height[n-1];

        // // Right Max
        // for(int i = n-2; i >= 0; i--){
        //     rightMax[i] = Math.max(height[i], rightMax[i+1]);
        // }

        // int trapWater = 0;

        // for(int i = 0; i < n; i++){
        //     int waterLevel = Math.min(leftMax[i], rightMax[i]);
        //     trapWater += waterLevel - height[i];
        // }

        // return trapWater;
    }
    
}