package solid.principles.interfacesegregation;

public class FreeParking implements ParkingLot
{
	/*
	 * This is wrong because we need to implement pay and fee method in
	 * Free parking lot also which is wrong
	 */
	@Override
	public void parkCar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unparkCar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCapacity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateFee(Car car) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void doPayment(Car car) {
		// TODO Auto-generated method stub
		throw new Exception("Parking lot is Free");
	}

}
