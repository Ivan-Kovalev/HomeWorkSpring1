package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String hello() {
        return serviceCalculator.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + serviceCalculator.calculatorPlus(a, b);
    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + serviceCalculator.calculatorMinus(a, b);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + serviceCalculator.calculatorMultiply(a, b);
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + serviceCalculator.calculatorDivide(a, b);
    }

    @GetMapping("/sqrt")
    public String calculatorSquareRoot(@RequestParam("num1") Integer a) {
        return " √" + a + " = " + serviceCalculator.calculatorSquareRoot(a);
    }
}