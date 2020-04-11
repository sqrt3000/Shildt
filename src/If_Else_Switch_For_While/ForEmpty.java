package If_Else_Switch_For_While;
//Пропуск отдельных составляющих в определении цикла for
public class ForEmpty {

    public static void main(String args[]){
        int i;

        for (i = 0; i < 10; ){
            System.out.println("Проход #" + i);
            i++; //инкрементировать переменную цикла
        }
    }

}
