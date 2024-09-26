public class ZinsDemo {

    public static void main(String[] args) {
        float kontostand = 10000;
        float zinsen = 2.25f;

        System.out.printf("Der Kontostand mit Zinsen beträgt %.2f€; Zinsbetrag = %.2f€\n", calcZinsen(kontostand, zinsen), (calcZinsen(kontostand, zinsen) - kontostand));
        zinsen = 3.35f;
        System.out.printf("Der Kontostand mit Zinsen beträgt %.2f€; Zinsbetrag = %.2f€\n", calcZinsen(kontostand, zinsen), (calcZinsen(kontostand, zinsen) - kontostand));
        zinsen = 5.75f;
        System.out.printf("Der Kontostand mit Zinsen beträgt %.2f€; Zinsbetrag = %.2f€\n", calcZinsen(kontostand, zinsen), (calcZinsen(kontostand, zinsen) - kontostand));

    }

    public static float calcZinsen(float kontostand, float zinsen){
        return kontostand * (1 + zinsen/100);
    }
}
