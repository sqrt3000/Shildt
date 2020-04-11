package If_Else_Switch_For_While;
//Игра в угадывание букв, вторая версия
public class Guess2 {

    public static void main(String args[])
        throws java.io.IOException{

        char ch, answer = 'S';

        System.out.println("Зaдyмaнa буква из диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("*** ПРАВИЛЬНО! ***");
        else System.out.println("...Извинитe, вы не угадали.");
    }

}
