package ClassesObjectsMethods;
//Демонстрация сборки мусора и метода finalize()
class FDemo{
    int x;

    FDemo(int i){
        x = i;
    }

    //Вызывается при удалении объекта
    protected void finalize(){
        System.out.println("Финаизация " + x);
    }

    // Генерирует объект, который тотчас же уничтожается
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}

public class FinalizeDemo {

    public static void main(String args[]){
        int count;

        FDemo ob = new FDemo(0);
        /*Генерируется большое количество объектов.
        В какой-то момент должна начаться сборка мусора.
        Примечание: возможно, для того чтобы активизировать
        систему сборки  мусора, количество генерируемых объектов
        придется  увеличить*/

        for (count = 1; count < 1000000; count++)
            ob.generator(count);
    }

}
