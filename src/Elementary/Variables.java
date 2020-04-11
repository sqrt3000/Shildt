/*
Демонстрация использования переменных.
Присвойте файлу с исходным кодом имя Example2.java.
*/

package Elementary;

public class Variables {

    public static void main (String[] args){
        int var1; // объявляется переменная
        int var2; // объявляется еще одна переменная

        //Можно обьявить и так:
        // int var1, var2;

        var1 = 1024; // переменной varl присваивается значение 1024

        System.out.println("Пepeмeннaя varl содержит " + var1);

        var2 = var1/2;

        System.out.print("Пepeмeннaя var2 содержит varl / 2: ");
        System.out.println(var2);
    }

}
