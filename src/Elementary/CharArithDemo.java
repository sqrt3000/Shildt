package Elementary;

public class CharArithDemo {

    public static void main(String args[]){
        char ch;

        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // инкрементировать переменную ch (двигаемся по таблице ASCI символов)
        System.out.println("теперь ch содержит " + ch);

        ch = 90; // присваиваем значение 90, что по таблице ASCI соответствует букве Z
        System.out.println("теперь ch содержит " + ch);
    }

}
