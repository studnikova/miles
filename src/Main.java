public class Main {

    public static void main(String[] args) {
        int price = 17_000;
        int bonusMiles = 20;

        int bonus = price / bonusMiles;

        System.out.println("Начислено миль: " + bonus);
    }
}
