package guguri;
public class BookManager {

    // 정적 기호 상수
    private static int MAX_SIZE = 10;

    // Book 배열
    Book[] bookList = new Book[MAX_SIZE];

    // 현재 책의 권수를 저장하는 변수
    private int size = 0;


    public void add(String title, String author) {
        // 책 객체를 하나 생성해서
        Book book = new Book();
        // 값을 세팅해준다.
        book.setTitle(title);
        book.setAuthor(author);
        bookList[size] = book;
        // 한 개의 책을 추가했으니, size를 1 증가 시켜준다.
        size++;
    }

    // 책 이름으로 찾아서 삭제하기
    public void remove(String title) {
        // 책 리스트의 길이만큼 배열을 돈다.
        for (int i = 0; i < bookList.length; i++) {
            // 돌면서 값을 하나씩 확인하며 이름이 같은 것을 찾는다.
            if (bookList[i].equals(title)) {
                // 배열은 remove 메서드가 없기 때문에 해당하는 인덱스의 값을 null로 치환한다.
                bookList[i] = null;
            }
        }
    }

    // 모든책의 리스트 출력하기
    public void getList() {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println("[" + i+1 + "]" + " 책제목: " + bookList[i].getTitle() + "," + " 저자: " + bookList[i].getAuthor());
        }
    }

    // 책 이름으로 책을 찾아서 책 정보 출력하기
    public void searchByTitle(String title) {
        for (int i = 0; i < 10; i++) {
            // 돌면서 값을 하나씩 확인하며 이름이 같은 것을 찾는다.
            if (bookList[i].getTitle().equals(title)) {
                // 같은 것을 찾았다면 그에 해당하는 책 정보를 출력한다.
                System.out.println("책 제목: " + bookList[i].getTitle() + ", " + "저자: " + bookList[i].getAuthor());
            }
        }
    }

    // 등록된 책의 권수 가져오기
    public int getBookCount() {
        int count = 0;
        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) {
                count++;
            }
        }
        return count;
    }
}

