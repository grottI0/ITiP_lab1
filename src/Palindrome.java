// Определяет является ли строка палиндромом и выводит результат
public class Palindrome {
    // Выводит результат проверки на палиндром
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println("Палиндром");
            } else {
                System.out.println("Не палиндром");
            }
        }

    }
    // Переворачивает строку
    public static String reverseString (String str){
        String reversed = "";
        for (int i = (str.length() - 1); i > -1; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
    // Проверяет является ли строка палиндромом
    public static boolean isPalindrome (String str){
        return str.equals(reverseString(str));
    }
}
