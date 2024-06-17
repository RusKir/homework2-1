public class Main {
    public static void main(String[] args) {

        int startedBalance = 100;
        int added = 1100;
        int bonus = 0;

        if (added > 1000) {
            bonus = added / 100;
        }
        int endedBalance = startedBalance + added + bonus;
        System.out.println("Итого: " + endedBalance);
        System.out.println("Из них бонусов: " + bonus);
    }
}