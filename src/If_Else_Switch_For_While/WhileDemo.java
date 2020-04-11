package If_Else_Switch_For_While;
// Демонстрация использования цикла while
public class WhileDemo {

    public static void main(String args[]){
        char ch;

        //вывести буквы английского алфавита, используя цикл while
        ch = 'A';
        while (ch <= 'Z'){
            System.out.print("\t" + ch);
            ch++;
        }
    }

}
