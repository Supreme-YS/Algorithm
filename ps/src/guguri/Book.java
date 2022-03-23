package guguri;
public class Book {

    // 인스턴스 필드
    private String title;
    private String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 기본 생성자
    public Book() {
    }

    // Getter, Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // toString() 메서드
    @Override
    public String toString() {
        return "책이름: " + title + ", " + "책저자: " + author;
    }
}
