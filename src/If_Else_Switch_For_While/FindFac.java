package If_Else_Switch_For_While;
//Использовать вложенные циклы для нахождения
//делителей чисел от 2 до 100
public class FindFac {

    public static void main(String args[]){

        for (int i = 2; i <= 100; i++) {
            System.out.println("Дeлитeли " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i%j) == 0) System.out.println(j + " ");
                    System.out.println();

        }
    }

}
