package Elementary;

public class IfDemo {

    public static void main(String[] args){
        int a, b, c;
        a = 2;
        b = 3;

        if(a < b) System.out.println("a меньше b");
        // Следющая строка никогда не может быть выведена
        if (a == b) System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; // переменная "с" содержит значение -1

        System.out.println("c содержит -1");
        if(c >= 0) System.out.println("C - не отрицательное число");
        if(c < 0) System.out.println("C - отрицательное число");

        System.out.println();

        System.out.println("С содержит 1");
        if (c >= 0) System.out.println("C - не отрицательное число");
        if (c < 0) System.out.println("C - не отрицательное число");

    }

}
