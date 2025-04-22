package Level_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    //속성
    private ArrayList<Integer> arrayList = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);

    int number1;
    int number2;
    int resultNumber;
    String operatorCheck;

    //생성자
    public Calculator(){
    }

    //기능
    public void start(){
        System.out.println("계산기를 실행합니다.");
    }

    //저장된 리스트확인
    public void checkList(){
        System.out.println("현재 저장된 정수는 "+this.arrayList+ "입니다.");
    }
    //리스트에 추가
    public void setArrayList() {
        System.out.println("추가하고싶은 값을 입력하세요");
        int number = scanner.nextInt();
        String remove = scanner.nextLine();
        this.arrayList.add(number);
        System.out.println(number + " 값이 추가되었습니다");
        System.out.println(this.arrayList);
    }
    //리스트에서 값 제거
    public void removeArraylList(){
        System.out.println(this.arrayList);
        System.out.println("몇번째 값을 제거하고싶으신가요.");
        int number = scanner.nextInt();
        String remove = scanner.nextLine();
        if(number<1){
            System.out.println("잘못된 입력값 입니다.");
        }else {
            this.arrayList.remove(number - 1);
            System.out.println(number + " 번째 값이 제거되었습니다");
            System.out.println(arrayList);
        }
    }
    //요구사항 첫번째값만 제거 this.arrayList와 arraylist 결과가 같다.
    public void removeFirstArrayList(){
        this.arrayList.remove(0);
        System.out.println(this.arrayList);
    }

    //종료메서드
    public boolean end(){
        System.out.println("종료를 원하시면 exit를 입력해주세요");
        String exit =scanner.nextLine();
        if(exit.equals("exit")){
            System.out.println("계산기를 종료합니다.");
            return false;
        }else{
            return true;
        }
    }
    //숫자를 입력받고 계산메서드에서 활용하기위해 인스턴스변수에 저장
    public void inputFirst(){
        System.out.println("첫번째 양의 정수를 입력해주세요");
        number1 = scanner.nextInt();
    }
    public void inputSecond(){
        System.out.println("두번째 양의 정수를 입력해주세요");
        number2 =scanner.nextInt();
        String remove = scanner.nextLine(); // 개행문자 제거
    }
    //입력받은값 확인
    public void checkNumber(){
        System.out.println("첫번째 숫자 " + number1);
        System.out.println("두번째 숫자 " + number2);
    }

    //연산수행
    public void operator(){
        System.out.println("연산기호를 선택해주세요.(+ - * /)");
        operatorCheck = scanner.nextLine();
        switch (operatorCheck){
            case "+" ->{
                resultNumber = number1+number2;
                System.out.println("+ 연산 결과는 " + resultNumber + "입니다.");
                this.arrayList.add(resultNumber);
            }
            case "-" ->{
                resultNumber = number1-number2;
                System.out.println("- 연산 결과는 " + resultNumber + "입니다.");
                this.arrayList.add(resultNumber);
            }
            case "*" ->{
                resultNumber = number1*number2;
                System.out.println("* 연산 결과는 " + resultNumber + "입니다.");
                this.arrayList.add(resultNumber);
            }
            case "/" ->{
                if(number2 == 0){
                    System.out.println("분모에는 0이 올 수 없습니다.");
                }else{
                    resultNumber = number1 / number2;
                    System.out.println("/ 연산 결과는 " + resultNumber + "입니다.");
                    this.arrayList.add(resultNumber);}
            }
            default -> {
                System.out.println("잘못된 입력값 입니다.");
            }
        }
    }
}
