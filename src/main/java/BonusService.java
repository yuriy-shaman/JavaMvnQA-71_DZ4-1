public class BonusService {
    // Метод рассчета бонусных рублей, в зависимости от стоимости
    // покупки и наличия регистрации покупателя и ограничение числа бонусов
    public long calculate(long amount, boolean registered) { // число бонусов рассчитываем методом calculate,
        //используя входные данные amount (стоимость покупки) и registered (зарегистрированный польз-ль или нет)
        int percent = registered ? 3 : 1; // Условие начисления размера бонусов в процентах от покупки
        long bonus = amount * percent / 100; // Расчет размера бонусов в процентах от стоимости покупки
        long limit = 500;   // Предел ограничение числа бонусных баллов
        if (bonus > limit) { // Ограничение числа
            bonus = limit;   //                    бонусных баллов
        }
        return bonus; // Передать вычисленное и проверенное число бонусов для вывода в терминал
    }
}