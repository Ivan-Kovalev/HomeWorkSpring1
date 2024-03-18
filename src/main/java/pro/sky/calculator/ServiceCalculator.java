package pro.sky.calculator;

public interface ServiceCalculator {
    String hello();

    String calculatorPlus(Integer a, Integer b);

    String calculatorMinus(Integer a, Integer b);

    String calculatorMultiply(Integer a, Integer b);

    String calculatorDivide(Integer a, Integer b);

    String calculatorSquareRoot(Integer a);
}