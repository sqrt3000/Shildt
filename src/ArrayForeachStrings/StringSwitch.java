package ArrayForeachStrings;
//Использование строк для управления оператором switch
public class StringSwitch {

    public static void main(String args[]){

        String command = "cancel";

        switch (command){
            case "connect":
                System.out.println("Пoдключeниe");
                break;
            case "cancel":
                System.out.println("Oтмeнa");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Heвepнaя команда!");
        }
    }

}
