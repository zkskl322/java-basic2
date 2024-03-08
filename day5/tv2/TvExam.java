/*package day5.tv2;

public class TvExam {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        a표준Tv = a샤오미Tv;
        // a표준Tv.이름세팅(); // 이름세팅이라는 함수의 사용이 꼭 필요하지만 실수로 빼먹을 경우 오류나 버그가 발생할 수 있다.
        a표준Tv.켜기();
        // 출력 : 샤오미Tv 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미Tv 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.이름세팅();
        a표준Tv.켜기();
        // 출력 : 삼성Tv 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성Tv 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.이름세팅();
        a표준Tv.켜기();
        // 출력 : LGTv 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTv 꺼집니다.


        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();

    }
}

// 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속받아 오버라이딩 해서 사용해야 한다.
class 표준Tv{ // 추상클래스
    String brand;
    void 켜기() {
        System.out.println(brand + "켜집니다.");
    }

     void 이름세팅() {

     }
     void 끄기() {

     }

}
class 샤오미Tv extends 표준Tv{ // 표준Tv 에게 물려받은 켜기 메서드가 내용이 없는 추상메서드이기 때문에 오버라이딩 하지 않으면 실행 할 수 없음


    void 이름세팅() {
        brand = "샤오미Tv"; // 변수 선언(만들기). 표준Tv에게 물려받은 brand변수와는 다르다. 샤오미Tv에게만 있는 변수이다.
    }

    // 연산은 함수에서만 가능.
    // class에는 변수와 함수 선언만 가능하다.

    void 끄기() {
        System.out.println("샤오미Tv 꺼집니다.");
    }

    void 켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv{

    void 이름세팅() {
        brand = "삼성Tv";
    }
    void 끄기() {
        System.out.println("삼성Tv 꺼집니다.");
    }

    void 켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv{
    void 이름세팅() {
        brand = "LGTv";
    }
    void 끄기() {
        System.out.println("LGTv 꺼집니다.");
    }

    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}*/