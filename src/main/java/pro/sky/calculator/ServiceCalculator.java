package pro.sky.calculator;

public interface ServiceCalculator {
    String hello();

    int calculatorPlus(Integer a, Integer b);

    int calculatorMinus(Integer a, Integer b);

    int calculatorMultiply(Integer a, Integer b);

    int calculatorDivide(Integer a, Integer b);

    double calculatorSquareRoot(Integer a);
}