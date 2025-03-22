class Solution {
    public:
        int maxArea(vector<int>& height) {
            int left = 0;
            int right = height.size()-1;
            int MaxArea = 0;
            while(left<right){
                int breadth = right - left;
                int Min = min(height[left] , height[right]);
                int Area = Min *breadth;
                MaxArea = max(Area,MaxArea);
                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
            return MaxArea;
        }
    };