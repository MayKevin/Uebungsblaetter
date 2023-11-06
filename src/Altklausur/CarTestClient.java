package Altklausur;

public class CarTestClient {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", "black");
        car1.setPrice(35000);
        System.out.println(car1.getPrice());
    }
}
