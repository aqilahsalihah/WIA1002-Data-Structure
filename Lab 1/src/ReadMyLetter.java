import java.io.*;
import java.util.Scanner;

public class ReadMyLetter {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        char c;
        try{
            PrintWriter out = new PrintWriter(
                    new FileOutputStream("AqilahSalihah_U2101806.txt",true));
            String s = "";
//            do{
//                System.out.print("new line: ");
////                s += input.nextLine();
//                s += "\n";
//
//                System.out.print("Continue writing (y/n)?: ");
//                c = input.nextLine().charAt(0);
//
//            } while (c == 'y');
            System.out.println("enter text: ");
            String st = input.nextLine();

            out.println("\n");
            out.print(st);
            out.close();
            System.out.println("write to file successful\n");
        } catch (IOException e){
            System.out.println("Problem writing to text file");
        }//exception checking if file is empty?

        try{
            Scanner in = new Scanner(
                    new FileInputStream("AqilahSalihah_U2101806.txt"));
            while (in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException k){
            System.out.println("File Not Found");
        }
    }
}
