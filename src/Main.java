public class Main {
    public static void main(String[] args) {
        //Вход: начальный счет
        double initAmount = -100.21;

        //Вход: сумма пополнения
        int plusAmount = 1001;

        //Бонус
        int bonus;

        //проверка условия
        if (plusAmount > 1000) {
            bonus = plusAmount / 100;
        } else {
            bonus = 0;
        }
        //Формула итогового счета
        double totalAmount = initAmount + plusAmount + bonus;

        // Вывод на экран бонуса и итогового счета
        System.out.println(bonus + " бонусных рублей");
        System.out.println("Итоговый счет " + totalAmount + " рублей");
    }
}
