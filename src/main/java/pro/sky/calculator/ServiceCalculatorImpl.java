package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public int calculatorPlus(Integer a, Integer b) {
        return a + b;
    }

    public int calculatorMinus(Integer a, Integer b) {
        return a - b;
    }

    public int calculatorMultiply(Integer a, Integer b) {
        return a * b;
    }

    public int calculatorDivide(Integer a, Integer b) {
        return a / b;
    }

    public double calculatorSquareRoot(Integer a) {
        return Math.sqrt(a);
    }
}