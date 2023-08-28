// WAP to calculate/print area and circumference of a circle. 

package JavaPrograms;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args){
        float radius = 5.2f;

        float area = 3.14f * radius * radius;
        float circumference = 2 * 3.14f * radius;

        System.out.println("Area of a circle: "+area);
        System.out.println("Circumference of a circle: "+circumference);
    }
}
