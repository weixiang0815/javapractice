
public class Encapsulation {

	public static void main(String arg[]) {
		Car car = new Car("Chevrolet","Camaro",2021);
		car.setYear(2022);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}
	
}
