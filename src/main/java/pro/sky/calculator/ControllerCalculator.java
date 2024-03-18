package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalculator {
    private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return serviceCalculator.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String calculatePlus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return serviceCalculator.calculatorPlus(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String calculateMinus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return serviceCalculator.calculatorMinus(a, b);
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculateMultiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return serviceCalculator.calculatorMultiply(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String calculateDivide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return serviceCalculator.calculatorDivide(a, b);
    }

    @GetMapping(path = "/calculator/sqrt")
    public String calculatorSquareRoot(@RequestParam("num1") Integer a) {
        return serviceCalculator.calculatorSquareRoot(a);
    }
}