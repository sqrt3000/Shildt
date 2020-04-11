package ClassesObjectsMethods;

//Добавление метода range() в класс Vehicle_2
class Vehicle_2{

    int passengers; //количество пассажиров
    int fuelcap; //емкость топливного бака
    int mpg;  // потребление топлива в милях на галлон

    // Отобразить дальность поездки транспортного средства
    void range() {
        System.out.println("Дaльнocть - " + fuelcap * mpg + " миль.");
        //return mpg * f ue 1 с ар; //Можно просто вернуть даnьность поездкн дпя заданноrо тронспортноrо средства
        //Тогда вызов этого метода будет таким: rangel = rninivan.range()
    }
}

public class AddMeth {
    public static void main(String args[]){
        Vehicle_2 minivan = new Vehicle_2();
        Vehicle_2 sportscar = new Vehicle_2();
        int rangel, range2;

        // Присвоить значения полям в объекте minivan
        minivan.passengers  =  7;
        minivan.fuelcap = 16;
        minivan.mpg  =  21;

        // Присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap  =  14;
        sportscar.mpg = 12;

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " пассажиров. ");

        minivan.range(); //отобразить дальность поездки мини-фургона

        System.out.print("Cпopтивный автомобиль может перевезти " + sportscar.passengers + " пассажиров. ");

        sportscar.range(); //отобразить дальность поездки спортивного автомобиля
    }
}
