import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, vucutKitleEndeksi;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        vucutKitleEndeksi = kilo / (boy * boy);

        System.out.println("Vücut kitle İndeksiniz: " + vucutKitleEndeksi);
    }
}