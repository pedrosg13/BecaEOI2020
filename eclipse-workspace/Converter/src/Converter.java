
public class Converter {

	double toCelciusFromFarenheit(double celsius) {

		return 32 + ((9 * celsius) / 5);

	}

	public double toFarenheitFromCelcius(double farenheit) {

		return (farenheit - 32) * (5 / 9);

	}

}
