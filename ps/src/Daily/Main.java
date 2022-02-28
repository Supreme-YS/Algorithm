package Daily;

import java.util.Arrays;

public class Main{

    public static void testsort(int[] a, int maxVal) {
        int [] bucketArr=new int[maxVal+1];

        //버킷사이즈에다가 0으로 초기화시켜준다.
        for (int i=0; i<bucketArr.length; i++) {
            bucketArr[i]=0;
        }
        //입력 리스트의 숫자마다 버킷의 값들을 ++시켜준다.
        for (int i=0; i<a.length; i++) {
            bucketArr[a[i]]++;
        }

        for (int k=1; k<= maxVal; k++) {
            System.out.print(bucketArr[k]+" ");
        }
        //버킷의 길이 만큼 돌린다음 그 안에 가진 값들 만큼을 돌려준다.
        int outPos=0;

        //
        for (int i=0; i<bucketArr.length; i++) {
            for (int j=0; j<bucketArr[i]; j++) {
                a[outPos++]=i;
                System.out.println("a[outPos-1] = " + a[outPos-1]);
            }
        }
    }

    public static void main(String[] iargs) {
        int [] myArr= {4,1,2,5,1};
        int max=0;
        for(int i=1 ; i<myArr.length ; i++) {
            if(myArr[i]>max) {
                max = myArr[i];
            }
        }

        System.out.println("Before: " + Arrays.toString(myArr));
        long beforeTime = System.currentTimeMillis();
        testsort(myArr,max);
        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime)/60;
        System.out.println("After:  " + Arrays.toString(myArr));
        System.out.println("Time :  "+secDiffTime);
    }
}