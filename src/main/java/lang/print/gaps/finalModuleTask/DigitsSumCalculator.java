package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int num1 = number % 10;
        number = number /10;
        int num2 = number % 10;
        number = number /10;
        int num3 = number % 10;
        number = number /10;
        int num4 = number % 10;
        number = number /10;
        int result = num1 + num2 + num3 + num4;
        System.out.println(result);
    }
}
