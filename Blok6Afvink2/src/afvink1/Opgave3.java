package afvink1;

public class Opgave3 {
	public static void main (String[] args ){
		
		int[] valA = { 13, -22, 82, 17};
		int[] valB = {-12, 24, -79, -13};
		int[] sum = { 0, 0, 0, 0};

		// Schrijf de code om de optelling van A en B
		int i;
		for(i=0; i<valA.length; i++) {
			sum[i] = valA[i] + valB[i];
		}
		// uit te voeren en de resultante in sum te plaatsen
		System.out.println( "sum: "
				+ sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]
				);
	}
}
