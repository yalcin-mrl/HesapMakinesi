import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float sonuc = 0;
        int n1,n2,select;
        System.out.println("Toplama-1\nCıkarma-2\nCarpma-3\nBolme-4");
        select = sc.nextInt();
        System.out.print("1.sayı: ");
        n1 = sc.nextInt();
        System.out.println("2. Sayi: ");
        n2 = sc.nextInt();
        switch (select) {
            case 1 -> sonuc = n1 + n2;
            case 2 -> sonuc = n1 - n2;
            case 3 -> sonuc = (float) n1 / n2;
            case 4 -> sonuc = n1 * n2;
            default -> {
            }
        }
        System.out.println("Sonuc : "+ sonuc);
    }
}
