package Daily;

public class WrongBananaMilk {
    public static void main(String[] args) {
        int bananaMilk = 2; // 바나나 우유를 두 개 산다
        boolean melonBread = true; // 메론 빵이 있다.

        if (melonBread==true) { // 메론빵이 있으면
            bananaMilk = 4; // 네개 산다
        }
        System.out.println(bananaMilk); // 결과 값 : 4
    }
}
