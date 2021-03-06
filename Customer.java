package cs2030.simulator;

class Customer {
	private final int customerID;
	private final double arrivalTime;

	public Customer(int customerID, double arrivalTime) {
		this.customerID = customerID;
		this.arrivalTime = arrivalTime;
	}

	public int getCustomerID() {
        return customerID;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

	@Override
	public String toString() {
		return customerID + " arrives at " +  arrivalTime;
	}
}
