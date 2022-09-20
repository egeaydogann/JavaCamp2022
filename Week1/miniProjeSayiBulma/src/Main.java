public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 12};
        int aranacak = 11;
        boolean flag = false;


        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Sayi liste içinde bulunmakadır.");
        } else {
            System.out.println("Aradığınız sayı liste içinde değil.");
        }
    }
}
