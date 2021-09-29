public class Storage {
    public static Car[] cars;

    Storage() {
        cars = new Car[10];
        cars[0] = new Car("a119db21-bce2-4576-ba1d-4b5ee39079a7", "BMW", "X5", 2012, "black",20000, "KA8456BQ");
        cars[1] = new Car("ccaf6ba1-b569-4ee4-8476-80bb072dbb40", "Tesla", "Model 3", 2018, "black",30000, "KA2522AQ");
        cars[2] = new Car("6ea0a392-8373-4438-8a11-e42248b3c472", "Ford", "Mustang", 2012, "blue",15000, "KA8456AB");
        cars[3] = new Car("7fe9d6ac-d624-4563-8540-d72d4fa6e5fb", "Audi", "A3", 2015, "red",10000, "AA1476AF");
        cars[4] = new Car("b5901085-76dc-4fa3-bb05-9c053d55cbb2", "Honda", "S2000", 2005, "grey",12000, "KA8629AQ");
        cars[5] = new Car("e6f08be3-d6ee-40ee-ba59-6096ce2f9649", "Honda", "Civic", 2007, "yellow",11000, "BM3715AK");
        cars[6] = new Car("3fea8f54-3c59-4f9b-b69e-8065a87fa740", "Jeep", "Wrangler", 2010, "red",10000, "BI1489AX");
        cars[7] = new Car("6c6c7114-4b11-45e5-a70d-12118fb2c023", "BMW", "X5", 2017, "black",16000, "BB1916AQ");
        cars[8] = new Car("09017c91-06c3-41c2-a54b-3ab4d34b858c", "BMW", "X4", 2002, "white",18000, "KA9184AQ");
        cars[9] = new Car("38caaeb6-12a8-40ca-9509-62600c49e475", "Ford", "Ranger", 2009, "black",13000, "AA8326AX");
    }
}