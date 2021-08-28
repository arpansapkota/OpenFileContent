package findFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new Printer();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Address where to search ");
        String address = scan.next();
        printer.listAll(address);

        System.out.println("Enter the file name");
        String fileName = scan.next();


        printer.printFile(address,fileName);

    }
}
