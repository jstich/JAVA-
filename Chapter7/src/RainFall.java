import java.util.Arrays;

public class RainFall {

	private double[] rain;

	public RainFall(double r[]) {

	    // Create a new array.
	    rain = new double[r.length];

	    for (int i = 0; i < r.length; i++) {
	        rain[i] = r[i];
	    }
	}

	public double getTotalRainFall() {
	    return Arrays.stream(rain).sum();
	}

	public double getAverageRainFall() {
	    return Arrays.stream(rain).average().getAsDouble();
	}

	public int getHighestMonth() {

	    int highest = 0;

	    // Find the element with the highest value.
	    for (int i = 1; i < rain.length; i++) {
	        if (rain[i] > rain[highest])
	            highest = i;
	    }

	    // Return the element number.
	    return highest;
	}

	public int getLowestMonth() {
	    int lowest = 0;

	    // Find the element with the lowest value.
	    for (int i = 1; i < rain.length; i++) {
	        if (rain[i] < rain[lowest])
	            lowest = i;
	    }
	    // Return the element number.
	    return lowest;
	}

	public double getRainAt(int e) {
	    return rain[e];
	}
	
}
