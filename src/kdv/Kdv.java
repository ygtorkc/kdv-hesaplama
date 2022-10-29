package kdv;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] arg) {
        double tutar, kdvOran=0.18;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Ücret tutarını giriniz:");
        tutar = input.nextDouble();
        double kdvTutar= tutar*kdvOran ;
        double kdvliTutar= kdvTutar+tutar;
        System.out.println(kdvliTutar);



    }
}
