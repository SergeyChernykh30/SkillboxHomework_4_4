import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Main {
    // вывести на экран символ и его код
    public static void main(String[] args) {
        /*String englishAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФЧЦЧШЩЪЫЬЭЮЯ";

        for (int i = 0; i < englishAlphabet.length(); i++)
        {
            System.out.println("Symbol " +  englishAlphabet.charAt(i) + " has code = " + (int) englishAlphabet.charAt(i));
        }

        for (int i = 0; i < russianAlphabet.length(); i++)
        {
            System.out.println("Symbol " +  russianAlphabet.charAt(i) + " has code = " + (int) russianAlphabet.charAt(i));
        }*/

        //программа должна печатать тект из консоли в формате
        //Фамилия: Иванов
        //Имя: Иван
        //Отчество: Иванович
        //пользователь вводит строку, программа разделяет строку и печатает в формате
        //дополнительно:
        //сделать программу устойчивой к ошибкам. Например когда ввели одно имя или ввели без отчества

        System.out.println("Please enter your name in next format: Last name Name Middle name");
        Scanner stringScanner = new Scanner(System.in);

        while (stringScanner.hasNext()) {

            String enteredName = stringScanner.nextLine();

            if (countWords(enteredName) < 3 || countWords(enteredName) > 3){
                System.out.println("Wrong format! Please enter correct format!");
                return;
            }

            String lastName = enteredName.substring(0, enteredName.indexOf(' '));
            String name = enteredName.substring(enteredName.indexOf(' ') + 1, enteredName.lastIndexOf(' '));
            String middleName = enteredName.substring(enteredName.lastIndexOf(' ') + 1);

            System.out.println("Last name: " + lastName);
            System.out.println("Name: " + name);
            System.out.println("Middle name: " + middleName);
        }
    }

    public static int countWords(String sentence){
        if(sentence == null || sentence.isEmpty()){
            return 0;
        }

        String[] words = sentence.split("\\s+");
        return words.length;
    }
}