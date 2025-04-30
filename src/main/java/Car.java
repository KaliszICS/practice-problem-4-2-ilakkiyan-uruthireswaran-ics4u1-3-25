public class Car{
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public String setMake(String m) {
        return this.make = m;
    }

    public String setModel(String mod) {
        return this.model = mod;
    }

    public int setYear(int y) {
        return this.year = y;
    }

    public double setPrice(double cost) {
        return this.price = cost;
    }
}

