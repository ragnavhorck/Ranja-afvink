package afvink1;

public class Opgave2 {


	public static void main ( String[] args ){
		int[] val = {13, -4, 82, 17};
		

		System.out.println( "Original Array: "
				+ val[0] + " " + val[1] + " " + val[2] + " " + val[3]
				);
		// Construeer een array voor twice
		
		int[] twice = new int [val.length];
		
		// Stop in twice de dubbele waardes van val
		
		int i;
		for(i=0; i<val.length; i++) {
			twice[i] = val[i]*2;
		}
		
		System.out.println( "New Array: "
				+ twice[0] + " " + twice[1] + " " + twice[2] + " " +
				twice[3] );
	}
}
