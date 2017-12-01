package afvink1;

public class Opdracht2 {

	public static void main(String[] args) {
		System.out.println(isDNA("PATGCTTGC"));
		System.out.println(isDNArec("AGGTTTGGTRTTGGG"));
	}

	public static boolean isDNA(String seq) {


		for (int i = 0; i<seq.length(); i++) {
			if (seq.charAt(i) == 'A' || seq.charAt(i)== 'G' || seq.charAt(i) == 'C' || seq.charAt(i) == 'T') {

			}
			else {
				return false;
			}
		}
		return true;
	}


	public static boolean isDNArec(String seq) {
		return isDNAhelper(seq,0);
	}

	public static boolean isDNAhelper(String seq, int i) {
		if(i >= seq.length()) {
			return true;

		}else {
			if (seq.charAt(i) == 'A' || seq.charAt(i)== 'G' || seq.charAt(i) == 'C' || seq.charAt(i) == 'T') {
				return isDNAhelper(seq,i+1);
			}
			else {
				return false;
			}
		}
	}
}
