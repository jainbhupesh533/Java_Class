import static java.lang.System.*;  

class Calculator {
    int a = 10;
    int b = 5;

    void add() {
        out.print(a + b);
    }

    void sub() {
        out.print(a - b);
    }

    void mul() {
        out.print(a * b);
    }

    void div() {
        out.print(a / b);
    }

    public static void main(String[] args) {
        Calculator n1 = new Calculator();
        n1.add();
        n1.sub();
        n1.mul();
        n1.div();
    }
}
