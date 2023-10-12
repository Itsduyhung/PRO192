import java.util.Scanner;
public class casionormal {
    public static void main(String[] args){
        System.out.println("hay nhap 2 so ban muon tinh");
        Scanner ip = new Scanner(System.in);
        double a = ip.nextDouble();
        double b = ip.nextDouble();
        System.out.println("hay chon phep tinh");
        System.out.println("1.thuc hien phep cong");
        System.out.println("2.thuc hien phep tru");
        System.out.println("3.thuc hien phep nhan");
        System.out.println("4.thuc hien phep chia");
        int choicenumber = ip.nextInt();
        double result;
        switch (choicenumber){
            case 1:
            System.out.println("thuc hien phep cong");
            result = a+b;
            System.out.println("ket qua cua phep tinh la " + result);
            break;
            case 2:
            System.out.println("thuc hien phep tru");
            result = a-b;
            System.out.println("ket qua cua phep tinh la " + result);
            break;
            case 3:
            System.out.println("thuc hien phep nhan");
            result = a*b;
            System.out.println("ket qua cua phep tinh la " + result);
            break;
            case 4:
            System.out.println("thuc hien phep chia");
            result = a/b;
            System.out.println("ket qua cua phep tinh la " + result);
            break;  
            default:
            System.out.println("error");
            break;
        }
        ip.close();
        System.out.println("the end");
    }
}