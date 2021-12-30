package DesignPattern.Prototype;

// Cloneable은 정의되어 있는 인터페이스
public class Shape implements Cloneable {
    // Shape은 구현체
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
