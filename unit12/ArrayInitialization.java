public class ArrayInitialization{
    public static void printStuff(int[][] values){
        for (int[] row : values)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printStuff2(double[][] values){
        for (double[] row : values)
        {
            for (double value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[][] diagonal = new int[10][10];
        
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(i == j){
                    diagonal[i][j] = 1;
                }else{
                    diagonal[i][j] = 0;
                }
            }
        }
        
        
        String[][] strs ={ {"I ", "love "},
                          {"coding ", "so ", "much!"} };
        System.out.println(strs[0][0] + strs[0][1] + strs[1][0] + strs[1][1] + strs[1][2]);
        
        
        double[][] nums = new double[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                nums[i][j] = (i*10+10) + j*1+1;
            }
        }
        
        int[][] nums2 = new int[6][5];
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                nums2[i][j] = i+1;
            }
        }
        
        
        printStuff(diagonal);
        printStuff2(nums);
        printStuff(nums2);
        
    }
}