import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh a2x + bx + c = 0");
        Scanner input = new Scanner(System.in);
        System.out.println("input value for a:");
        int a = input.nextInt();
        System.out.println("input value for b:");
        int b = input.nextInt();
        System.out.println("input value for c:");
        int c = input.nextInt();
        QuadraticEquation examEquation = new QuadraticEquation(a,b,c);
        double delta = examEquation.getDiscriminant();
        if (delta<0){
            System.out.println("The equation has no root");
        }else if(delta==0){
            System.out.println("The equation has only root:\t"+examEquation.getRoot1());
        }else {
            System.out.printf("\nThe euqation has root1: %.2f\t and root2: %.2f ",examEquation.getRoot1(),examEquation.getRoot2());
        }
    }

    private int a, b, c;

    public QuadraticEquation(int _a, int _b, int _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0)
            return 0;
        else
            return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0)
            return 0;
        else
            return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }
}
