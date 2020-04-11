package ClassesObjectsMethods;
//В этой программе создаются два объекта класса Vehicle
class Vehicle_{
    int passengers; // количество пассажиров
    int fuelcap;  // емкость топливного бака
    int mpg;  // потребление топлива в милях на галлон}
}

    // В этом классе объявляется объект типа Vehicle

public class TwoVehicles {

    public static void main(String args[]){
        Vehicle_ minivan = new Vehicle_();
        Vehicle_ sportcar = new Vehicle_();

        int range1, range2;

        //Присвоить  значения  полям в объекте minivan
        minivan.passengers  =  7;
        minivan.fuelcap  =  16;
        minivan.mpg = 21;

        //Присвоить  значения  полям в объекте sportscar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //Рассчитать  даль ность поездки при  полном баке
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль");
        System.out.println("Cпopтивный автомобиль может перевезти " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль");
    }

}
