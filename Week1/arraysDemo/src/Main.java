public class Main {

    public static void main(String[] args) {
String ogrenci1 = "Ege";
String ogrenci2="Derin";
String ogrenci3= "Osman";
String ogrenci4= "Hayal";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);


        String[] ogrenciler = new String[4];
        ogrenciler[0]="Ege";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Osman";
        ogrenciler[3]="Hayal";

        for(int i=0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
        }




    }

