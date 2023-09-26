import java.util.Scanner;
public class fullname {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          System.out.println("input your name");
          String name = scanner.nextLine();
          System.out.println("input ur firstname");
          String firstname = scanner.nextLine();
        System.out.println("ur name " + (name));
        System.out.println("ur firstname " + (firstname));
        System.out.println("ur full name is "+ (firstname+name));
    }
}
