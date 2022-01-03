package Daily;

public class AccessLevelModifierMethod {
    public static void main(String[] args) {
        Greeting.hi();
    }
}

class Greeting {
    public static void hi() {
        System.out.println("hi");
    }
}