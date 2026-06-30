
class Solution{
    public int missingNumber(int[] nums){
        long n=nums.length;
        long ans=n*(n+1)/2;
        long sum=0;
        for(int i=0;i<n;i++) sum+=nums[i];
        return (int)(ans-sum);
    }
}