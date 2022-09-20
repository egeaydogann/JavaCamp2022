public class Main {

    public static void main(String[] args) {
	char harf='ü';
    boolean flag = true;
    char[] kalinSesli = {'A','O','U','I','a','o','u','ı'};
    for (int i=0;i<4;i++){
        if (kalinSesli[i]==harf){
            System.out.println("Kalın sesli harf.");
            flag = false;
            break;
        }


    }
    if (flag){
        System.out.println("İnce sesli harf.");
    }

    }
}
