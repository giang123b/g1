import java.util.Scanner;

public class CayATM {
    public static void main(String[] args) {
        int sotien;
        int[] a = {10000, 20000, 50000, 100000, 200000, 500000};
        Scanner x = new Scanner(System.in);
        do {
            System.out.printf("Nhap so tien ban muon rut: ");
            sotien = x.nextInt();
        }
        while (sotien < 50000);
        x.close();
        int dem = 0, i = 5, tien=sotien;
        System.out.println("Menh gia(VND)      So luong(to)      Thanh Tien(VND)");
        do{
            int t = sotien-a[i];
            if ( t>= 0) {
                dem++;
                sotien -= a[i];
            } else {
                if (dem != 0) System.out.printf("%-,20d %-20d %-,20d\n", a[i], dem, (a[i] * dem));
                dem = 0;
                i--;
            }
        }
        while (sotien >= 0);
        System.out.printf("===================================\nTong so tien: %d", tien);
    }
}
