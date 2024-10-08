import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Random random = new Random();
      int rastgeleSayi = random.nextInt(100)+1; // 1-100 arassında rastgele sayı
      int tahminSayi;
      int tahminHakki=3;
      Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında bir sayı tahmininde bulununuz.3 hakkınız vardır.");
        while (tahminHakki > 0){
            System.out.println("Tahmininiz: ");
            tahminSayi= scanner.nextInt();

        if (tahminSayi == rastgeleSayi){
            System.out.println("Tebrikler bildiniz.");
        }
        else {
            tahminHakki--;
            if (tahminHakki>0){
                System.out.println("Tahmininiz doğru değil.Kalan hakkınız: " + tahminHakki);
            }
            else {
                System.out.println("Hakkınız kalmadı.Doğru sayı: "+ rastgeleSayi);
            }
        }
        }
    }
}
