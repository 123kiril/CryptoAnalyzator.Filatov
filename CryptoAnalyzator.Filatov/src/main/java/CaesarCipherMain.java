import java.util.Scanner;

import static Encrtyp_Decrtypt.Decrypt.decoding;
import static Encrtyp_Decrtypt.Encrypr.encoding;


//Не совсем понятно как работать с файлом из джавы здесь
//Вот я могу проверить есть ли такой файл допустим,а как дальше с ним работать непонятно,
//пытался через сплит но не получилось дальльше на слова разбить
// BufferedReader br = new BufferedReader(new FileReader("D:\\CryptroFilatov\\text\\text.txt"));
//while ((str = br.readLine()) != null) {
//                String list = String.valueOf(str.split(" "));
//                list.split(" ");
//////////////////////////////////////////////////////////////
//Плюс интересно какой вид вначале лучше так или как в тексте:

//if (s1.equalsIgnoreCase("Encryption")) {
//       System.out.println("Пожалуйста,введите путь к файлу");
//        String pyti = scanner.nextLine();
//       Files.exists(Path.of(pyti));
//       System.out.println("Пожалуйста,введите ключ");
//       Scanner sc1 = new Scanner(System.in);
//       int key = sc1.nextInt();
//       Encryption.Encryption();
//       } else if (s1.equalsIgnoreCase("Decryption")) {
//       System.out.println("Пожалуйста,введите путь к файлу");
//       String pyti = scanner.nextLine();
//       Files.exists(Path.of(pyti));
//       System.out.println("Пожалуйста,введите ключ");
//       Scanner sc1 = new Scanner(System.in);
//       int key = sc1.nextInt();
//       Decryption.Decrypt(pyti,key);
//       }
public class CaesarCipherMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text message to be encrypted ");
        String msg;
        msg = scan.next();
        System.out.println(" Encrypted Text : " + encoding(msg, 4));
        System.out.print(" Decryptd Text : ");
        System.out.print(decoding(encoding(msg, 4), 4));
        scan.close();
    }
}
