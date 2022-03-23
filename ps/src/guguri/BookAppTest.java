package guguri;

import java.util.Scanner;

public class BookAppTest {
    public static void main(String[] args) {
        showMenu();
        choiceMenu();
    }

    public static void choiceMenu() {
        BookManager bookManager = new BookManager();
        Scanner sc = new Scanner(System.in);

        p("원하는 메뉴를 골라보세요 : ");

        String choiceNum = sc.next();
        char choice = choiceNum.charAt(0);

        while (choice != '0') {
            switch (choice) {
                case '1':
                    String title;
                    String author;

                    pl("첫번째 메뉴입니다.");
                    pl("책 정보를 입력해주세요 : ");
                    p("책 제목 : ");
                    title = sc.next();
                    p("책 저자 : ");
                    author = sc.next();
                    bookManager.add(title, author);
                    System.out.println("책 등록이 완료되었습니다.");

                    showMenu();
                    choiceMenu();

                case '2':
                    String removeTitle;
                    pl("두번째 메뉴입니다.");
                    p("삭제할 책 정보를 입력해주세요 : ");
                    removeTitle = sc.next();
                    pl("********책 삭제**********");
                    p("~~~ 삭제 완료! ~~~");

                    showMenu();
                    choiceMenu();

                case '3':
                    pl("세번째 메뉴입니다.");
                    p("********책 리스트********");
                    bookManager.getList();

                    showMenu();
                    choiceMenu();

                case '4':
                    String findBook;
                    pl("네번째 메뉴입니다.");
                    p("검색할 책 제목을 입력하세요 : ");
                    findBook = sc.next();
                    p("********책 검색********");
                    bookManager.searchByTitle(findBook);
                    p("********검색완료********");

                    showMenu();
                    choiceMenu();

                case '0':
                    pl("시스템을 종료합니다.");
                    break;
            }
        }
    }

    // 메뉴를 보여주는 화면
    public static void showMenu() {
        pl("== [도서관리 VO.1] ==");
        pl("1. 책 등록");
        pl("2. 책 삭제");
        pl("3. 책 리스트");
        pl("4. 책 검색");
        pl("0. 종료");
        pl("==================");
    }

    // 책을 등록하는 화면
    public static void addBook() {

        pl("책 제목 : ");
        pl("책 저자 : ");
    }

    // ----------------------------------
    public static void p(String msg) {
        System.out.print(msg);
    }

    public static void pl(String msg) {
        System.out.println(msg);
    }
}
