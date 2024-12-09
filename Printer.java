class Answer {
    public int factorial(int n) {
        // Введите свое решение ниже
        n = 2;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
    int n = 5;
    if (args.length > 0) {
    n = Integer.parseInt(args[0]);
    Answer ans = new Answer();
int itresume_res = ans.factorial(n);
System.out.println(itresume_res);
}
}
