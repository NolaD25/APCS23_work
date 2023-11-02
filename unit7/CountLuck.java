public class CountLuck{
    public static void testCountLucky(int[] nums, double expected){
        int result = countLucky(nums);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(result == expected){
            System.out.println("YASSSS");
        }else{
            System.out.println("NOOOOOO");
        }
    }
    public static int countLucky(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%7 == 0){
                total++;
            }else if(nums[i]%10 == 7){
                total++;
            }
        }
        return total;
    }
    public static void main (String[] args){
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {7,13,17};
        int[] nums3 = {107,207};
        
        testCountLucky(nums1, 0);
        testCountLucky(nums2, 2);
        testCountLucky(nums3, 2);
    }
    
}