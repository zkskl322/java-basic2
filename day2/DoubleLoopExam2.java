package day2;

public class DoubleLoopExam2 {
    public static void main(String[] args) {
        int y = 5;

        for(int i = 1; i <= y; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
