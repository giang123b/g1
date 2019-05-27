import java.util.Scanner;

public class MayTinhCamTay {
    public static void main(String[] args) {
        int so1, so2;
        String ptinh;
        Scanner x = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        so1 = x.nextInt();
        x.nextLine();
        System.out.println("Nhap phep tinh: ");
        ptinh = x.nextLine();
        System.out.println("Nhap so thu hai: ");
        so2 = x.nextInt();
        x.close();
        System.out.printf("Ket qua: "+so1+" "+ptinh+" "+so2 + " = ");
        switch (ptinh){
            case "-":{
                System.out.print((so1-so2));
                break;
            }
            case "+":{
                System.out.print((so1+so2));
                break;
            }
            case "*":{
                System.out.print((so1*so2));
                break;
            }
            case "/":{
                System.out.print((so1/so2));
                break;
            }
        }
    }
}
