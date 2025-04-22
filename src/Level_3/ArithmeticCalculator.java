package Level_3;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        Calculator<?> calculator = new Calculator<>();


        while(isRunning){
            System.out.println("1. 연산 2. 저장값확인 3. 종료 4. test");

                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1 -> {
                        System.out.println("연산을 수행합니다.");
                        calculator.inputNumber();
                        calculator.runCalculator();
                    }
                    case 2 -> {
                        for (Double value : calculator.checkList()){
                            System.out.println(value);
                        }
                    }
                    case 3 -> {
                        System.out.println("종료를 원하시면 exit를 눌러주세요.");
                        String exit = scan.nextLine();
                        if (exit.equals("exit")) {
                            isRunning = false;
                        }
                    }
                    case 4 -> calculator.inputNumber();
                    default -> System.out.println("잘못된 입력입니다");
                }
            if (isRunning == false){
                System.out.println("프로그램을 종료합니다.");
            }
        }

    }
}
