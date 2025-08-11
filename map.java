public class map {

    public int[] two_sum(int[] nums, int target) {
        int n=nums.lenght;
        for(int i = 0; i<nums.lenght-1; i++) {
            for(int j = i+1; j<nums.length; j++ ) {
                if(nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
    }
    public static void main(String[] args) {


        

    }
}
