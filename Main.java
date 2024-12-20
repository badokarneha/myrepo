//java program of exception handling to demonstrate the concept of try with multiple catch

public class Main {

    public static void main(String[] args) {

        int num = 20;
        int den = 0;

        try {
            int res = num / den;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } catch (Exception e) {
            System.out.println("Error: An error occurred");
        } finally {
            System.out.println("Execution completed");


            nnn
        }
    }
}


