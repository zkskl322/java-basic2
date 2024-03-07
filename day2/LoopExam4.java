package day2;

public class LoopExam4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;

        // v1
        if( a > b) {
            for(int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
        else {
            for(int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }

        // v2

        if(a > b) {
            int c = a;
            a = b;
            b = c;
        }
        for(int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}
