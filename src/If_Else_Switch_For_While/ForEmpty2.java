package If_Else_Switch_For_While;
//Пропуск отдельных составляющих в определении цикла for
public class ForEmpty2 {

    public static void main(String args[]){
        int i;
        i = 0;

        for (; i < 10; ){
            System.out.println("Проход #" + i);
            i++;
        }
    }

}
