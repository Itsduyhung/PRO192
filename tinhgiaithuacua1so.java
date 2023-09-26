import java.util.Scanner;
public class tinhgiaithuacua1so {
    public static void main (String[] args){
    Scanner ip = new Scanner(System.in);
    System.out.println(" hay nhap 1 so de tinh giai thua");
    int n = ip.nextInt();
    int giaithua;
    giaithua = 1;
    for(int i=1;i<=n;i++) {
        giaithua=giaithua*i;
    }System.out.println("gia tri giai thua cua "+(n));
    System.out.println(+giaithua);
}
}
