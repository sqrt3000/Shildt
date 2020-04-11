package If_Else_Switch_For_While;
//Вывод квадратных корней чисел от 1 до 99 вместе с ошибкой округления
public class SqrToot {

    public static void main(String args[]){
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Kopeнь квадратный из " + num + " равен " + sroot);

            //вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("0шибкa округления: " + rerr);
            System.out.println();
        }
    }

}
