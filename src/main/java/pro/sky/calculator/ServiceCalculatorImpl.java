package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String calculatorPlus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Ошибка!");
        } else {
            return (a + " + " + b + " = " + (a + b));
        }
    }

    public String calculatorMinus(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Ошибка!");
        } else {
            return (a + " - " + b + " = " + (a - b));
        }
    }

    public String calculatorMultiply(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Ошибка!");
        } else {
            return (a + " * " + b + " = " + (a * b));
        }
    }

    public String calculatorDivide(Integer a, Integer b) {
        if (a == null || b == null || b == 0) {
            throw new RuntimeException("Ошибка!");
        } else {
            return (a + " / " + b + " = " + (a / b));
        }
    }

    public String calculatorSquareRoot(Integer a) {
        if (a == null) {
            throw new RuntimeException("Ошибка!");
        } else {
            return ("√ " + a + " = " + (Math.sqrt(a)));
        }
    }
}