package Level_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit;

        while (true){
            System.out.println("프로그램을 실행합니다.");
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요(+, - , *, /): ");
            String remove = sc.nextLine();
            String method = sc.nextLine();
            System.out.println(method+ " 연산을 수행합니다.");
            if(method.equals("+")){
                System.out.println("덧셈 결과는 : "+ (num1+num2));
            } else if (method.equals("-")) {
                System.out.println("뺄셈 결과는 : "+ (num1-num2));
            }else if (method.equals("*")) {
                System.out.println("곱셈 결과는 : "+ (num1*num2));
            }else if (method.equals("/")) {
                if (num2 == 0){
                    System.out.println("나눗셈 연산에서 분모는 0이될 수 없습니다.");
                }else{
                    System.out.println("나눗셈 결과는 : "+ (num1/num2));
                }}

            System.out.println("추가작업을 수행하십니까(Enter Key)? 종료를 원하시면 exit를 입력해주세요");
            exit = sc.nextLine();
            if(exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else if(exit.isEmpty()){
            }
        }
    }
}
