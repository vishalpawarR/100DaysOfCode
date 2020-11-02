package solid.principles.interfacesegregation;

public interface ParkingLot 
{
	void parkCar(); // decrease empty spot count by 1
	void unparkCar(); // increase empty spot count by 1
	void getCapacity(); // Return parkinglot capacity
	double calculateFee(Car car); // Return the price based on number of hours
	void doPayment(Car car);
}

class Car
{
	
}
