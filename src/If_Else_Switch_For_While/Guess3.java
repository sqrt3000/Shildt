package If_Else_Switch_For_While;
//Игра в угадывание букв, третья версия
public class Guess3 {

    public static void main(String args[])
        throws java.io.IOException{

        char ch, answer = 'S';

        System.out.println("Зaдyмaнa буква из диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.print("...Извинитe, нужная буква находится ");
            if (ch < answer)
                System.out.println("ближe к концу алфавита");
            else System.out.println("ближe к началу алфавита");
        }
    }

}
