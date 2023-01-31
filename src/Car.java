public class Car {
    private String model;
    private int miles;

    public Car(String mod, int mil) {
        model = mod;
        miles = mil;
    }

    public String toString() {
        return model + " " + miles + "mi";
    }
}
