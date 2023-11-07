public class Main {

    public static void main(String[] args) {

        BonusService service = new BonusService();    //Объект, выполняющий функцию service

        long amount = 5000;       // Стоимость покупки
        boolean registered = true; // Зарегистрированный пользователь

       long expected = 50;     // Ожидаемое число начисленных бонусщв
        long actual = service.calculate(amount, registered);   // Фактическое число начисленных бонусщв

        System.out.println( expected + " == ? == " + actual );    //  Вывод результата сравнения в терминал

    }
}
