public class Main {

    public static void main(String[] args) {
	//1,2,3>>>6
        int sayi = 5;
        int total = 0;
        for (int i=1; i<sayi; i++){
        if (sayi % i == 0){
            total += i;
        }}
        if (sayi == total){
            System.out.println("Mükemmel sayı.");
        }
        else{
            System.out.println("Mükemmel sayı değil.");
        }
    }
}
