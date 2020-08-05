package util;

public class CurrencyConverter {

	public double totalDollars(double dollarPrice, double amountDollars) {
		return dollarPrice * amountDollars;
	}

	public double paidIOF(double dollarPrice, double amountDollars) {
		return dollarPrice * amountDollars / 100 * 6;
	}
}