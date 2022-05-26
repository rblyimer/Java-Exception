package ValidatingParameters;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        /*System.out.println(calculator.factorial(-1)); //IllegalArgumentException
        System.out.println(calculator.binomialCoefficent(5, 6));//IllegalArgumentException */
        System.out.println(calculator.factorial(10));
        System.out.println(calculator.binomialCoefficent(5, 4));
    }

    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0 ");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 && subsetSize > setSize) {
            throw new IllegalArgumentException("Number must be greater than or equal to 0, and " +
            "\nSubset dimension must be smaller than set dimension");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);
        return numerator / denominator;
    }
}
