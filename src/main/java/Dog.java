public class Dog {
    private String name;
    private String breed;
    private int weight;

    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getWeight() {
        return this.weight;
    }

    public String setName(String arg) {
        return this.name = arg;
    }

    public String setBreed(String arg) {
        return this.breed = arg;
    }

    public int setWeight(int arg) {
        return this.weight = arg;
    }
}