// Вывод простых чисел от 2 до 100
public class Primes {
    // Перебор чисел от 2 до 100 и их проверка на пренадлежность к простым
    public static void main(String[] args) {
        for (int number = 2; number < 101; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Проверка числа на принадлежность к простым
    public static boolean isPrime(int n) {
        int count = 0;
        for (int divisor = 2; divisor < n; divisor++) {
            if (n % divisor == 0) {
                count += 1;
            }
            if (count > 0) {
                return false;
            }
        }
        return true;
    }
}