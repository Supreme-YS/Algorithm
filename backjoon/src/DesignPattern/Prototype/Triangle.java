package DesignPattern.Prototype;

public class Triangle extends Shape {

    private int x, y, r;

    public Triangle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Triangle copy() throws CloneNotSupportedException {
        Triangle triangle = (Triangle) clone();

        // 복사-붙여넣기 할 때 완전히 겹치지 않게 하려고 위치값 조정해주는거
        triangle.x = x + 1;
        triangle.y = y + 1;

        return triangle;
    }
}
