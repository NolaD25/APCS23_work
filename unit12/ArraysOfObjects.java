public class ArraysOfObjects{
    public static double average(Rectangle[][] rectangles){
        double total = 0;
        double num = 0;
        
        for(int i = 0; i < rectangles.length; i++){
            for(int j = 0; j < rectangles[i].length; j++){
                total += rectangles[i][j].perimeter();
                num+=1;
            }
        }
        return total / num;
    }
    public static Rectangle greatestArea(Rectangle[][] rectangles){
    double greatest = 0;
    Rectangle greatestAreaRect = rectangles[0][0];
        for(int i = 0; i < rectangles.length; i++){
            for(int j = 0; j < rectangles[i].length; j++){
                if(rectangles[i][j].area() > greatest){
                    greatest = rectangles[i][j].area();
                    greatestAreaRect = rectangles[i][j];
                }
            }
        }
    return greatestAreaRect;
    }
    public static void main(String[] args){
        Rectangle[][] rectangles = {{new Rectangle("rect1", 2,9), new Rectangle("rect2", 3,8)},
                                    {new Rectangle("rect3", 4,7), new Rectangle("rect4", 5,6)},
                                    {new Rectangle("rect5", 1,10)}};
        
        System.out.println(average(rectangles));
        Rectangle area = greatestArea(rectangles);
        System.out.println(area.getName() + ", " + area.getWidth() + ", " + area.getHeight());
    }
}