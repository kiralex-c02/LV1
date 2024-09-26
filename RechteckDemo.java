public class RechteckDemo {
    public static void main(String[] args) {
        int leange = 4;
        int breite = 5;
        int umfang = 0;
        int flaeche = 0;

        flaeche = calcFlaeche(leange, breite);
        umfang = calcUmfang(leange, breite);

        System.out.printf("Die Fläche des Rechteccks beträgt: %d\n",flaeche);
        System.out.printf("Die Fläche des Rechteccks beträgt: %d",umfang);
    }

    public static int calcFlaeche(int length, int width){
        return length * width;
    }
    public static int calcUmfang(int length, int width){
        return (length + width) * 2;
    }

}
