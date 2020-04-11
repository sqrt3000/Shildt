package If_Else_Switch_For_While;
//Игра в угадывание букв
public class Guess {

    public static void main(String arge[])
        throws java.io.IOException{
        char ch, answer = 'S';

        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.print("Попытайтесь её угадать: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("** Правильно! **");
    }

}
