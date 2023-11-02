public class SumOfSquares{
    public static void testSumOfSquares(double[] nums, double expected){
        double result = sumOfSquares(nums);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(expected == result){
            System.out.println("YES");
        }else{
            System.out.println("NOPE");
        }
    }
    public static double sumOfSquares(double[] nums){
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            double square;
            square = nums[i]*nums[i];
            sum += square;
        }
        return sum;
        
    }
    public static void main(String[] args){
        double[] nums1 = {0};
        double[] nums2 = {1.0, 2.0, 3.0};
        double[] nums3 = {2.0,2.0,2.0};
        
        testSumOfSquares(nums1, 0);
        testSumOfSquares(nums2, 14.0);
        testSumOfSquares(nums3, 12.0);
    }
    
}