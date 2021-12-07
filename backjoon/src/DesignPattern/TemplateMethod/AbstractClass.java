package DesignPattern.TemplateMethod;

public abstract class AbstractClass {
    public abstract String showMe(); // 추상 클래스의 추상 메서드 showMe 정의
    public void printMessage() {
        System.out.print("As you can see, ");
        System.out.print(showMe());
        System.out.println(" is my name.");
    }
}

class Smith extends AbstractClass {
    @Override
    public String showMe() {
        return "Smith";
    }

    public static void main(String[] args) {
        AbstractClass myObject = new Smith();
        myObject.printMessage();
    }
}