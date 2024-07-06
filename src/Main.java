import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        double armut_f = 2.14,elma_f =3.67, domates_f =1.11, muz_f = 0.95, patlican_f = 5.0,armut_m,elma_m,domates_m,muz_m,patlican_m,tutar;
        Scanner girdi = new Scanner(System.in);
        girdi.useLocale(Locale.US);
        System.out.println("Kaç kilo armut almak isterisiniz: ");
        armut_m = girdi.nextDouble();
        System.out.println("Kaç kilo elma almak isterisiniz: ");
        elma_m = girdi.nextDouble();
        System.out.println("Kaç kilo domates almak isterisiniz: ");
        domates_m = girdi.nextDouble();
        System.out.println("Kaç kilo muz almak isterisiniz: ");
        muz_m = girdi.nextDouble();
        System.out.println("Kaç kilo patlican almak isterisiniz: ");
        patlican_m = girdi.nextDouble();
        tutar = (armut_f * armut_m) + (elma_f *elma_m) + (domates_m * domates_f) + (muz_m *muz_f) + (patlican_m *patlican_f);
        System.out.println("almış oldugunuz urunlerın toplam tutarı : " + tutar);

    }
}