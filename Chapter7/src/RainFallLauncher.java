
public class RainFallLauncher {

	
		public static void main(String[] args) {

		    // Array representing rainfall figures
		    // position correlates to the month
		    double[] thisYear = { 1.6, 2.1, 1.7, 3.5, 2.6, 3.7, 3.9, 2.6, 2.9, 4.3,
		            2.4, 3.7 };

		    RainFall r = new RainFall(thisYear);

		    // Display the statistics.
		    System.out.println("The total rainfall for this year is "  +r.getTotalRainFall());
		    System.out.println("The average rainfall for this year iS"  + r.getAverageRainFall());

		    int high = r.getHighestMonth();
		    System.out.println("The month with the highest amount of rain " + "is "  + (high + 1) + " with " + r.getRainAt(high) + " inches.");
		    int low = r.getLowestMonth();
		    System.out.println("The month with the lowest amount of rain " + "is "   + (low + 1) + " with " + r.getRainAt(low) + " inches.");
		}

	}


