import java.util.*;

public class CountLucky{
    public static void testCountLucky(ArrayList<Integer> nums, int expected){
        int result = countLucky(nums);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(expected == result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static int countLucky(ArrayList<Integer> nums){
        int total = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i)%7 == 0){
                total++;
            }else if(nums.get(i)%10 == 7){
                total++;
            }
        }
        return total;
    }
    public static void main (String[] args){
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(7);
        nums2.add(13);
        nums2.add(17);
        
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(107);
        nums3.add(207);
        
        testCountLucky(nums1, 0);
        testCountLucky(nums2, 2);
        testCountLucky(nums3, 2);
    }
    
    
}