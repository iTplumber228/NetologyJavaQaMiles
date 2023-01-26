public class Main {
    public static void main(String[] args) {
        int BonusMilesTicket = 10_000;
        int price = 20;

        if (BonusMilesTicket < 0) {
            BonusMilesTicket = 0;
        }
        int MilesNumber = BonusMilesTicket / price;
        System.out.println(MilesNumber);
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной мили

// Рассчитываете количество бонусных миль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран
    }
}
