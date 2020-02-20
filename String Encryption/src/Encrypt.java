import java.util.Scanner;

public class Encrypt{
    public static void main(String[] args) {

        String userinput = "";
        String alter = "";
        String decrypt;

        Scanner scan = new Scanner(System.in);

        //Encrypting String
        userinput = scan.next();
        alter = (userinput.substring(userinput.length() - 1) + userinput.substring(0,userinput.length() - 1) + "ay");
        System.out.println(alter);

        //Decrypting String

        decrypt = alter.substring(1, alter.length() - 2) + userinput.substring(userinput.length() - 1) ;
        System.out.println(decrypt);





    }

}