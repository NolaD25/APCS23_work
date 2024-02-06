public class ComputationsOn2DArrays{
    public static int smallest(int[][] nums){
        int smallnum = nums[0][0];
        for(int[] row: nums){
            for(int value: row){
                if(value < smallnum){
                   smallnum = value;
                }
            }
        }
        return smallnum;
    }
    public static float sum(float[][] nums){
        float total = 0;
        for(float[] row: nums){
            for(float value: row){
                total += value;
            }
        }
        return total;
    }
    public static int strsA(String[][] strs){
        int total = 0;
        for(String[] row: strs){
            for(String value: row){
                String first = value.substring(0,1);
                if(first.equals("a") || first.equals("A")){
                    total++;
                }
            }
        }
        return total;
    }
    
    public static void main(String[] args){
        int[][] nums = {{5, 6, 9},
                   {2, 6, 8, 1},
                   {4, 3}};
        float[][] nums2 ={{6, 7, 4, 9},
                    {7, 2, 5, 8}};
        String[][] strs ={{"Hello", "World", "Apple"},
                     {"Ace", "Spade", "Club", "Diamond"},
                     {"awesome"}};
        
        System.out.println(smallest(nums));
        System.out.println(sum(nums2));
        System.out.println(strsA(strs));
    }
}