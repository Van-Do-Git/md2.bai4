import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input height");
        int height = input.nextInt();
        System.out.println("Input width");
        int width = input.nextInt();
        Rectangle rec1 = new Rectangle(height,width);
        System.out.println("The height of rectangle is:\t"+rec1.getHeight());
        System.out.println("The width of rectangle is:\t"+rec1.getWidth());
        System.out.println("The area of rectangle is:\t"+rec1.getArea());
    }
}
