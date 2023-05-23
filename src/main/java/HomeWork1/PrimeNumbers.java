package HomeWork1;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int j = 2; j <= 1000; j++) {
            boolean prime = false;

            for (int i = 2; i * i <= j; i++) {
                prime = (j % i == 0);
                if (prime) {
                    break;
                }
            }
            if (!prime) {
                System.out.print(j + " ");
            }
        }
    }
}
