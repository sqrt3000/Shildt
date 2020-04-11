package ClassesObjectsMethods;
//Добавление конструктора
class Vehicle4{
    int passengers;  //  количество пассажиров
    int fuelcap;  //  емкость топливного бака
    int mpg;  //  потребление топлива в милях  на  галлон

    //Это конструктор класса Vehicle
    Vehicle4(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Определить дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    //Рассчитать объем топлива, необходимого транспортному
    //средству для преодоления заданного расстояния
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class VehConsDemo {

    public static void main(String args[]){

        //Полностью сконструировать объекты транспортных средств
        Vehicle4 minivan = new Vehicle4(7, 16, 21);
        Vehicle4 sportscar = new Vehicle4(2, 14, 12);
        double gallons;
        int dist  =  252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль мини-фургону требуется " + gallons + " галлонов топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + " миль спортивному автомобилю требуется " + gallons + " галлонов топлива");
    }

}
