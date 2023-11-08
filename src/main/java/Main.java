public class Main {

    public static void main(String[] args) {

        BonusService service = new BonusService();    //Объект, выполняющий функцию service

        long amount = 15000;       // Стоимость покупки
        boolean registered = false; // Не зарегистрированный пользователь
        //boolean registered = true;
        long expected = 150;     // Ожидаемое число начисленных бонусщв
        long actual = service.calculate(amount, registered );   // Фактическое число начисленных бонусщв

        System.out.println(expected + " == ? == " + actual);    //  Вывод результата сравнения в терминал

    }
}
