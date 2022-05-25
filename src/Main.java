public class Main {
    public static void main(String[] args) {
        //Вход: начальный счет
        double n = 100.21;

        //Вход: сумма пополнения
        int p = 1001;

        //Бонус
        int b;

        //проверка условия
        if (p > 1000) {
            b = p/100;
        } else {
            b = 0;
        }
        //Формула итогового счета
        double i = n+p+b;

        // Вывод на экран бонуса и текущего счета
        System.out.println(b + " бонусных рублей");
        System.out.println("На счету " + i + " рублей");
    }
}
