package bankaccountapp;

public interface IBaseRate {
	//method to return base rate
	default double getBaseRate() {
		return 2.5;
	}
}
