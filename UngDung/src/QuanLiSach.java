import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class QuanLiSach {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("1.Add a book");
        System.out.println("2.Edit list");
        System.out.println("3.Delete a book");
        System.out.println("4.Find a book");
        System.out.println("5.List Book");
        System.out.println("0.Thoat");
        do{
            System.out.printf("Nhap lua chon cua ban: ");
            x = x.nextInt();
            switch (x){
                case 1:{
                    addBook();
                    break;
                }
                case 2:{
                    editBook();
                    break;
                }
                case 3:{
                    deleteBook();
                    break;
                }
                case 4:{
                    findBook();
                    break;
                }
                case 5:{
                    listBook();
                    break;
                }
            }
        }while(x>0);
        x.close();
    }

    public static void addBook() {
        Scanner x = new Scanner(System.in);
        String tenSach = "";
        String idSach = "";
        double giaSach = 0;
        System.out.printf("Nhap ten sach: ");
        tenSach = x.nextLine();
        System.out.printf("Nhap ID sach: ");
        idSach = x.nextLine();
        System.out.printf("Nhap gia sach: ");
        giaSach = x.nextDouble();
        x.close();
    }
}
