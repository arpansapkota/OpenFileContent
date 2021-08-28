package findFile;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Printer implements PrinterInterface {
    private HashSet<String> contents;

    @Override
    public  void listAll(String address) {
        //List of all files and directories
        File file = new File(address);

        String[] contents = file.list();
        System.out.println("List of files and directories in the specified directory:");

        if (contents != null) {
            Arrays.stream(contents).forEach(System.out::println);
        } else {
            System.out.println("Invalid path");
        }

        this.contents = new HashSet<>(Arrays.asList(contents));

    }

    @Override
    public void printFile(String address,String fileName) {
        if (contents.contains(fileName)) {

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(address + "/" +  fileName));
                String line;
                System.out.println("The contents of the file are: ");
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("IO error");
                e.printStackTrace();
            }

        }else {
            System.out.println("File not found");
        }


    }
}
