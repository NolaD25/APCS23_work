import java.util.*;

public class SumOfSquares{
    public static void testSumOfSquares(ArrayList<Double> nums, double expected){
        double result = sumOfSquares(nums);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(result == expected){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static double sumOfSquares(ArrayList<Double> nums){
        double sum = 0;
        for(int i = 0; i < nums.size(); i++){
            double square;
            square = nums.get(i)*nums.get(i);
            sum += square;
        }
        return sum;
    }
    public static void main (String[] args){
        ArrayList<Double> nums1 = new ArrayList<Double>();
        nums1.add(0.0);
        
        ArrayList<Double> nums2 = new ArrayList<Double>();
        nums2.add(1.0);
        nums2.add(2.0);
        nums2.add(3.0);
        
        ArrayList<Double> nums3 = new ArrayList<Double>();
        nums3.add(2.0);
        nums3.add(2.0);
        nums3.add(2.0);
        
        testSumOfSquares(nums1, 0);
        testSumOfSquares(nums2, 14.0);
        testSumOfSquares(nums3, 12.0);
    }
}