package If_Else_Switch_For_While;
//Применение оператора continue
public class ContinueDemo {

    public static void main(String args[]){
        int i;

        //Вывести четные числа в пределах от О до 100
        for(i = 0; i <= 1000000000; i++){
            if ((i%2) != 0) continue; // завершить шаг итерации цикла
            System.out.println(i);
        }
    }

}
