public class Main {

    public static void main(String[] args) {
        int sayi = 15;
        int count = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                count++;
            }
        }

        if (sayi !=1){
            if (count > 2) {
                System.out.println("Sayı asal değil.");
            } else {
                System.out.println("Sayı asal.");
            }}
        else{
            System.out.println("Sayı asal değil.");
        }

    }
}
