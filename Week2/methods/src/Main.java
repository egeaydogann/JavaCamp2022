public class Main {

    public static void main(String[] args) {
        sayiBulmaca(5);
    }

    public static void sayiBulmaca(int arama){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 12};
        int aranacak = arama;
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
