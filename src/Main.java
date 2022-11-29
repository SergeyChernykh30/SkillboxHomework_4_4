import java.awt.font.FontRenderContext;

public class Main {
    // вывести на экран символ и его код
    public static void main(String[] args) {
        String englishAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String russianAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФЧЦЧШЩЪЫЬЭЮЯ";

        for (int i = 0; i < englishAlphabet.length(); i++)
        {
            System.out.println("Symbol " +  englishAlphabet.charAt(i) + " has code = " + (int) englishAlphabet.charAt(i));
        }

        for (int i = 0; i < russianAlphabet.length(); i++)
        {
            System.out.println("Symbol " +  russianAlphabet.charAt(i) + " has code = " + (int) russianAlphabet.charAt(i));
        }
    }
}