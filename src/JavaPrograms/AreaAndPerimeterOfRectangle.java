// WAP to calculate/print area and perimeter of a rectangle.

package JavaPrograms;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args){
        float length = 10.5f;
        float width = 4.8f;

        float area = length*width;
        float perimeter = 2 * (length + width);

        System.out.println("Area of a rectangle: "+area);
        System.out.println("Perimeter of a rectangle: "+perimeter);
    }
}
