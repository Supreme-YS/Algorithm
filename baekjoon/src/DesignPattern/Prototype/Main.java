package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Triangle triangle1 = new Triangle(1, 1, 3);
        Triangle triangle2 = triangle1.copy();

        System.out.println (triangle1.getX()+ ", " + triangle1.getY() + ", " + triangle1.getR());
        System.out.println (triangle2.getX()+ ", " + triangle2.getY() + ", " + triangle2.getR());

    }
}
