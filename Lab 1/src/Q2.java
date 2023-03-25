import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String file_1 = "C:\\Users\\Aqilah\\Documents\\UM\\WIA1002 Data Structure\\txt files\\text1.txt";
        String file_2 = "C:\\Users\\Aqilah\\Documents\\UM\\WIA1002 Data Structure\\txt files\\text2.txt";
        String file_3 = "C:\\Users\\Aqilah\\Documents\\UM\\WIA1002 Data Structure\\txt files\\text3.txt";
        String file_4 = "C:\\Users\\Aqilah\\Documents\\UM\\WIA1002 Data Structure\\txt files\\text4.txt";

        //file 1
        try {
            Scanner in = new Scanner(new FileInputStream(file_1));

            int character = 0;
            while (in.hasNextLine()) {
                String[] line = in.nextLine().split(",");
                for (int i = 0; i < line.length; i++) {
                    System.out.print(line[i]);
                    character++;
                }
                System.out.println();
            }
            System.out.println("Characters: " + character + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        //file 2
        try {
            Scanner in = new Scanner(new FileInputStream(file_2));

            int character = 0;
            while (in.hasNextLine()) {
                String[] line = in.nextLine().split(",");
                for (int i = 0; i < line.length; i++) {
                    System.out.print(line[i]);
                    character++;
                }
                System.out.println();
            }
            System.out.println("Characters: " + character + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        //file 3
        try {
            Scanner in = new Scanner(new FileInputStream(file_3));

            int character = 0;
            while (in.hasNextLine()) {
                String[] line = in.nextLine().split("; ");
                for (int i = 0; i < line.length; i++) {
                    System.out.print(line[i]);
                    character++;
                }
                System.out.println();
            }
            System.out.println("Characters: " + character + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        //file 4
        try {
            Scanner in = new Scanner(new FileInputStream(file_4));

            int character = 0;
            while (in.hasNextLine()) {
                String[] line = in.nextLine().split("\\d+");
                for (int i = 0; i < line.length; i++) {
                    System.out.print(line[i]);
                    character++;
                }
                System.out.println();
            }
            System.out.println("Characters: " + character + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }


//        public boolean isNumber; (String s){
//            if (Integer.parseInt(s) == null)
//                return false;
//            else
//                return true;
//        }
    }
}
