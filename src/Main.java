public class Main {
    public static void main(String[] args) {

        int account = 350;
        int replenishment = 2000;
        int bonus = replenishment > 1000 ? replenishment/100 : 0;

        System.out.println("Счет " + (account + replenishment)+" рублей(я)");
        System.out.println((bonus)+" бонусных(ый) рублей(ь)");

    }

}