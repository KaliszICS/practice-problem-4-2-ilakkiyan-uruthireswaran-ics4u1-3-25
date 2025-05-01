public class PracticeProblem {

	public static void main(String args[]) {
		Dog breed = new Dog("Dawg", "French BullDog", 28);
		System.out.println(breed.getName());
		System.out.println(breed.setWeight(30));

		Car auto = new Car("Toyota", "GT 86", 2021, 25000);
		System.out.println(auto.getMake() + " " + auto.getModel());
		System.out.println(auto.setPrice(20000));
	}

}
