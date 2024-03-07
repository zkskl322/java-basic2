package day4;

public class WarriorSimulation {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "홍길동";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        // 안녕하세요 저는 20살 홍길동입니다.

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 홍길동이/가 활로 공격합니다.
        a전사.스킬사용();

        a전사.a무기 = new 칼();
        a전사.공격();
        a전사.스킬사용();
        // 출력 : 홍길동이/가 칼로 공격합니다
    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
    void 공격() {
        System.out.println(이름 + "이/가 ");
        a무기.사용();
    }
    public void 스킬사용() {
        System.out.println(이름 + "이/가 ");
        a무기.무기스킬사용();
    }
}

class 무기 {
    public void 사용() {

    }
    public void 무기스킬사용() {

    }
}

class 칼 extends 무기 {
    double damage = 10;
    double magnification =  2;
    double skillDamage = damage * magnification;

    public void 사용() {
        System.out.println("칼로 데미지 " + damage + "공격 ");
    }
    public void 무기스킬사용() {
        System.out.println("연속 베기 스킬을 사용합니다. " + magnification + "배(" + skillDamage + ")의 피해를 입힙니다.");
    }
}

class 활 extends 무기 {
    double damage = 15;
    double magnification = 1.5;
    double skillDamage = damage * magnification;
    public void 사용() {
        System.out.println("활로 데미지" + damage + "공격");
    }
    public void 무기스킬사용() {
        System.out.println("불화살 스킬을 사용합니다." + magnification + "배(" + skillDamage + ")의 피해를 입힙니다.");
    }
}