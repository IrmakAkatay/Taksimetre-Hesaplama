import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km ;
        double  perKm =2.20,total=10;

        Scanner wab =new Scanner(System.in);
        System.out.print("Kilometre Değerini Giriniz :");
        km= wab.nextInt();

        total +=(perKm*km) ;
        total = (total < 20) ? 20 : total ;
        System.out.println("Tutar : "+total);


    }
    }

www.patika.dev
