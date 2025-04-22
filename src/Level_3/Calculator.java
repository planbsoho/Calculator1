package Level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator<T> {
    //속성
    Scanner scan = new Scanner(System.in);
    private List<Double> arraylist = new ArrayList<>();
    //계산할값을 저장하는 class변수
    static double number1;
    static double number2;


    //생성자
    public Calculator(){}
    //기능
    public void inputNumber(){
        System.out.println("두개의 숫자를 입력하세요(띄어쓰기로구분)");
       try {
           number1 = scan.nextDouble();
           number2 = scan.nextDouble();
           scan.nextLine();
           System.out.println("입력한 숫자는 " + number1 + ", " + number2);
       }catch (InputMismatchException e){
           System.out.println("잘못된 입력입니다.");
           scan.nextLine();
       }
    }
    public void runCalculator(){
        System.out.println("연산 부호를 입력하세요 + - * /");
        String check = scan.nextLine();
        switch(check){
            case "+" -> Operator.PLUS.run(this );
            case "-" -> Operator.SUBTRACT.run(this);
            case "*" -> Operator.MULTIPLY.run(this);
            case "/" -> Operator.DIVIDE.run(this);
            default -> System.out.println("올바른 연산 부호를 입력하세요");
        }
    }
    //사칙연산
    //게터
    public double getNumber1(){
        return this.number1;
    }
    public double getNumber2(){
        return this.number2;
    }
    //리스트게터
    public List<Double> checkList(){
        return this.arraylist;

    }
    //제네릭메서드?
    public <S> void print(S value){
        System.out.println(value);;
    }
    //세터 값추가 메서드
    public void add(Double value){
        arraylist.add((Double) value);
    }


}
