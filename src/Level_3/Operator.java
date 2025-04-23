package Level_3;

public enum Operator {
    //enum의 인스턴스메서드에 calculator객체를 매개변수로 받아 calculator의 메서드를 활용하고 그결과를 다시 calculator의 arraylist로 돌려줍니다.
    PLUS{
        @Override
        public void run(Calculator<?> calculator) {
            double result = calculator.getNumber1() + calculator.getNumber2();
            calculator.add(Double.valueOf(result));
            System.out.println("더하기 결과 : "+result);
        }
    },
    SUBTRACT{
        @Override
        public void run(Calculator<?> calculator) {
            double result = calculator.getNumber1() - calculator.getNumber2();
            calculator.add(Double.valueOf(result));
            System.out.println("빼기 결과 : "+result);
        }
    },
    MULTIPLY{
        @Override
        public void run(Calculator<?> calculator) {
            double result = calculator.getNumber1() * calculator.getNumber2();
            calculator.add(Double.valueOf(result));
            System.out.println("곱셈 결과 : "+result);
        }
    },
    DIVIDE{
        public void run(Calculator<?> calculator) {
            double result = calculator.getNumber1() / calculator.getNumber2();
            calculator.add(Double.valueOf(result));
            System.out.println("나눗셈 결과 : "+result);
        }
    };
    //enum에서 활용할 calculator 객체
    public abstract void run(Calculator<?> calculator);
}
