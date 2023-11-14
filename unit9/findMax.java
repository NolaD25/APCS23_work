import java.util.*;

public class findMax{
    public static void testFindMax(ArrayList<Double> nums,  double expected){
        double result = findMax(nums);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(result == expected){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
    public static double findMax(ArrayList<Double> nums){
        double max = nums.get(1);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Double> nums1 = new ArrayList<Double>();
        nums1.add(1.0);
        nums1.add(2.1);
        nums1.add(5.3);
        
        ArrayList<Double> nums2 = new ArrayList<Double>();
        nums2.add(0.0);
        nums2.add(-35.0);
        nums2.add(90.1);
        
        testFindMax(nums1, 5.3);
        testFindMax(nums2, 90.1);
    }
    
}