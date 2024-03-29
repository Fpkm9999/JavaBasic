package chapter26_designPattern.builder;

/**
 * ===========================================================
 * fileName       : Test
 * date           : 2024-02-16
 * description    : 빌더 패턴
 * 빌더 패턴의 주요 목적은 객체의 생성 과정을 추상화하고, 복잡한 객체의 생성을 단순화하는 것입니다.
 *
 * 생성자를 통해 객체를 생성하는 것이 주된 목적이 아니라,
 * 객체 생성 과정을 더 유연하고 명확하게 만드는 것에 초점이 있습니다.
 * ===========================================================
 */
public class Test {
    public static void main(String[] args) {
        /*
            객체 생성 시에 일정하지 않은 여러개의 조합으로 객체를 생성할 경우
            많은 수의 생성자를 만들어야 함
            빌더패턴은 유연하게 일정하지 않은 초기값으로 객체를 생성할 수 있음
         */

        Account accountEx = new Account.Builder().accID(33).balance(333).build(); // 마지막에 .build() 메소드는 외브클래스에 지금까지 입력한거 던져주는 역할

        Account account1 = new Account.Builder().accID(222).build();
        System.out.println(account1);

        // 계좌번호, 잔액을 초기값으로 객체 생성
        Account account2 = new Account.Builder().accID(222).balance(10000).build();
        System.out.println(account2);

        // 계좌번호, 잔액, 예금주를 초기값으로 객체 생성
        Account account3 = new Account.Builder().balance(10000).accID(222).cusName("홍길동").build();
        System.out.println(account3);

        // 잔액, 예금주를 초기값으로 객체 생성
        Account account4 = new Account.Builder().balance(10000).cusName("홍길동").build();
        System.out.println(account4);

        // 예금주를 초기값으로 객체 생성
        Account account5 = new Account.Builder().cusName("홍길동").build();
        System.out.println(account5);

        Account account6 = new Account.Builder().build();
        System.out.println(account6);

//                저희가 점 찍을 때 해당 클래스나 객체에 점 찍고 해당 객체의 멤버에 접근하잖아요?
                // 체이닝 메소드가
        // 사슬 처럼 계속 이어지는 느낌?의 형식


    }
}
// 자바 백엔드가면 어노테이션만 이용하면 @Builder 만 집어넣어도 자동으로 필드를 `Builder`로 만들어 주므로 원리를 아는게 중요.
// 자바에 대해 다 배우고 나면 스프링이라는 프로그램을 사용하는데
