public class Main {
    public static void main(String[] args) {
        NewCalculator calculator = new NewCalculator();

        // Try division
        calculator.Divide(100, 12);
        System.out.println(calculator.getLastResault());

        // Try addition
        calculator.Add(10, 35);
        System.out.println(calculator.getLastResault());

        // Try substraction
        calculator.Add(50, 15);
        System.out.println(calculator.getLastResault());

        // Try multipication
        calculator.Multiply(10, 30);
        System.out.println(calculator.getLastResault());
    }
}
