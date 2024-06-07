public class Main {
    public static void main(String[] args) {

        int started_balance = 100;
        int added = 1100;
        int bonus = 0;

        if (added > 1000) {
    bonus = added / 100;
}
        int endedBalance = started_balance + added + bonus;
        System.out.println("Итого: " + endedBalance);
        System.out.println("Из них бонусов: " + bonus);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}