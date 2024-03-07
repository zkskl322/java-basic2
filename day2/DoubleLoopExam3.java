package day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {
        int y = 5;

        for(int i = 1; i <= y; i++) {
            for(int j = 1; j <= y-1; j++) {
                System.out.println(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
