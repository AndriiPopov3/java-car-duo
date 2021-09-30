import java.lang.*;
import java.util.*;

public class Methods {

    static Car[] convertCarArrListToArr(List<Car> arrList) {
        Car[] arr = new Car[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    static void printArray(Car[] array) {
        for (Car x : array)
            System.out.print(x.id + " " + x.brand + " " + x.model + " " + x.releaseYear + " " + x.color + " " + x.price + " " + x.registrationNum + "\n");
    }

    public static Car[] getCarsByBrand(Car[] cars, String brand) {
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].brand.equals(brand)) {
                arrlist.add(cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        return arr;
    }

    public static Car[] getCarsByModelAndTime(Car[] cars, String model, int time) {
        int CURRENT_YEAR = 2021;
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].model.equals(model) && (CURRENT_YEAR - cars[i].releaseYear) > time) {
                arrlist.add(cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        return arr;
    }

    public static Car[] getCarsByReleaseYearAndPrice(Car[] cars, int releaseYear, int price) {
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].releaseYear == releaseYear && cars[i].price > price) {
                arrlist.add(cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        return arr;
    }

    public static void main(String[] args) {
        Storage database = new Storage();
        Car[] cars1 = getCarsByBrand(database.cars, "BMW");
        printArray(cars1);
        System.out.println("-------------");
        Car[] cars2 = getCarsByModelAndTime(database.cars, "X5", 5);
        printArray(cars2);
        System.out.println("-------------");
        Car[] cars3 = getCarsByReleaseYearAndPrice(database.cars, 2012, 14000);
        printArray(cars3);
    }
}
