package day2;

public class DoubleLoopExam4 {
    public static void main(String[] args) {
        int y = 5;
        int star_len = 0;

        for(int i = 0; i < y; i++) {
            int increase = 0;
            int decrease = 0;

            // y가 짝수 일 경우
            if(y % 2 == 0) {
                if (y / 2 > i) {
                    increase = 1;
                }
                else if(y / 2 < i) {
                    decrease = 1;
                }
            }
            // count가 홀수 일 star_len
            else{
                 if(y / 2 >= i) {
                     increase = 1;
                 }
                 else {
                     decrease = 1;
                 }
                }
            if(increase == 1) {
                star_len++;
            }

            if(decrease == 1) {
                star_len--;
            }

            for(int j = 0; j < star_len; j++) {
                System.out.println("*");
            }
            System.out.println();
            }
        }
    }