package ArrayForeachStrings;
//Предотвращение деления на нуль с помощью оператора?
public class NoZeroDiv {

    public static void main(String args[]){
        for(int i = -5; i < 6; i++)
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " равно " + 100 / i);
    }

}
