import java.lang.*;
import java.util.*;

public class Methods {
    static Storage database = new Storage();

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

    public static void getCarsByBrand(String brand) {
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < Storage.cars.length; i++) {
            if (Storage.cars[i].brand.equals(brand)) {
                arrlist.add(Storage.cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        printArray(arr);
    }

    public static void getCarsByModelAndTime(String model, int time) {
        int CURRENT_YEAR = 2021;
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < Storage.cars.length; i++) {
            if (Storage.cars[i].model.equals(model) && (CURRENT_YEAR - Storage.cars[i].releaseYear) > time) {
                arrlist.add(Storage.cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        printArray(arr);
    }

    public static void getCarsByReleaseYearAndPrice(int releaseYear, int price) {
        List<Car> arrlist = new ArrayList<>();
        for (int i = 0; i < Storage.cars.length; i++) {
            if (Storage.cars[i].releaseYear == releaseYear && Storage.cars[i].price > price) {
                arrlist.add(Storage.cars[i]);
            }
        }
        Car[] arr = convertCarArrListToArr(arrlist);
        printArray(arr);
    }

    public static void main(String[] args) {
        getCarsByBrand("BMW");
        System.out.println("-------------");
        getCarsByModelAndTime("X5", 5);
        System.out.println("-------------");
        getCarsByReleaseYearAndPrice(2012, 14000);
    }
}
