package If_Else_Switch_For_While;
//Чтение символа с клавиатуры
public class KbIn {

    public static void main(String args[])
        throws java.io.IOException{

        char ch;

        System.out.println("Нажмите нужню клавишу, а затем клавишу ENTER: ");
        ch = (char) System.in.read(); //получить символ

        System.out.println("Вы нажали клавишу " + ch);

    }

}
