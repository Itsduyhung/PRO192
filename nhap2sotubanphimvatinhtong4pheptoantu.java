import java.util.Scanner;
public class nhap2sotubanphimvatinhtong4phetoantu {
    public static void main(String[] args) {
        System.out.println("nhap2sotubanphim");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("ket qua cua a+b la: " + (a + b));
        System.out.println("ket qua cua a-b la: "+ (a - b));
        System.out.println("ket qua cua a*b la " + (a * b));
        System.out.println("ket qua cua a/b la " + (a / b));
    }
}