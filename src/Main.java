import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler
        double pi=3.14, alan, alan2;
        int a, r, cevre;

        //Scanner sınıfı
        Scanner input = new Scanner(System.in);

        //Çap bilgisini al
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        //Alanı hesapla
        alan =(int) (pi*(r*r));
        System.out.println("alan : "+alan+"cm2");

        //Çevreyi hesapla
        cevre=(int) (2*pi*r);
        System.out.println("çevre : "+cevre+"cm");

        //Yarıçap ve açıya göre alan hesaplama

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        System.out.print("Açıyı giriniz : ");
        a = input.nextInt();

        alan2 =(pi*(r*r)*a)/360;
        System.out.print("Dairenin alanı : "+alan2+"cm2");



    }
}