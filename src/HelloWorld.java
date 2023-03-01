import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please input your first name: ");
        String name = scnr.next();
        System.out.println("Hello " + name + ".");
    }
}

