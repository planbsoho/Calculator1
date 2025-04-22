package Level_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean calculatorRunnig=true;

        System.out.println("계산기를 실행합니다.");
        while (calculatorRunnig){
            System.out.println("원하는 작업을 선택하세요.");
            System.out.println("1. 사칙연산  2. 저장된값확인 3. 값 추가 4. 값 제거 5. 종료 6. 첫번째 값 제거");
            int number = scanner.nextInt();
            switch (number) {
                case 1 -> {
                    calculator.inputFirst();
                    calculator.inputSecond();
                    calculator.checkNumber();//입력받은정수확인
                    calculator.operator();//계산
                }
                case 2 -> calculator.checkList();//list확인
                case 3 -> calculator.setArrayList();//값추가
                case 4 -> calculator.removeArraylList();//값제거
                case 5 -> calculatorRunnig = calculator.end();//종료
                case 6 ->calculator.removeFirstArrayList();
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
        System.out.println("시스템을 종료합니다");
    }
}
