package BasicOfSoftwareCodeDevelopment;

// Найдите сумму квадратов первых ста чисел.
public class Cycles_3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Sum of  the first hundred numbers : " + sum);

    }

}
