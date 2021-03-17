
import java.util.Scanner;
public class Prettyfy {


        public static  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Provide the some texts: ");
            String string = scanner.nextLine();
             System.out.println("Provide a char: ");
            String seprator = scanner.nextLine();
            System.out.println (pretychr(string , seprator) );

            }


    public static String pretychr(String string, String seprator) {

        String result= "";
        char[] ch = new char[string.length()];


        for (int i = 0; i < string.length(); i++) {
        ch[i] = string.charAt(i);
        }

        for (char c : ch) {
        result = result + c + seprator;

        }
        return result;
        }

}