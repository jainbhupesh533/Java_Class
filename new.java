import static java.lang.System.*;
/*
class New{
    public static void main(String[] args) { // it will take as an arguement
        for(String s:args){
            out.println(s);
        }
    }
}
*/

class Calculator {
    int a = 10;
    double b = 20;

    void add() {
        out.println(a + b);
    }

    void sub() {
        out.println(a - b);
    }

    void mul() {
        out.println(a * b);
    }

    void div() {
        // float f=9.0f;
        // out.println(f);
        double c = (int) (a / b); // typecasting
        out.println(c);
    }

    public static void main(String[] args) {
        Calculator n1 = new Calculator();
        n1.add();
        n1.sub();
        n1.mul();
        n1.div();
    }
}
