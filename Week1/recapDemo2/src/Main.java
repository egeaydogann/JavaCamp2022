public class Main {

    public static void main(String[] args) {
        double[] mylist = {1.2, 1.3, 4.2, 5.1};
        double total = 0;
        double max = 0;
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;

        }
        System.out.println("En büyük sayı :" + max);
        System.out.println("Toplamları :" + total);
    }
}
