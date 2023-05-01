import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        int Km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input= new Scanner(System.in);
        System.out.println("Mesafeyi kilometre cinsinden yaz:");
        Km= input.nextInt();

        total =(Km * perKm);
        total += startPrice;

        total=(total< 20 ) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);

    }
}
