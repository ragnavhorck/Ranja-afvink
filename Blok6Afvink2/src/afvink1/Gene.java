package afvink1;

public class Gene implements Comparable{

	private String gene_id;
	private String symbol;
	private String chromosome_map_location;
	
	
	
	
	
	
	
	
	
	
	public Gene(String gene_id, String symbol, String chromosome_map_location) {
		this.gene_id = gene_id;
		this.symbol = symbol;
		this.chromosome_map_location = chromosome_map_location;
	}
	
	
	
	







	public String getGene_id() {
		return gene_id;
	}

	public void setGene_id(String gene_id) {
		this.gene_id = gene_id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getChromosome_map_location() {
		return chromosome_map_location;
	}
	public void setChromosome_map_location(String chromosome_map_location) {
		this.chromosome_map_location = chromosome_map_location;
	}






	@Override
	public String toString() {
		return "Gene [gene_id=" + gene_id + ", symbol=" + symbol + ", chromosome_map_location="
				+ chromosome_map_location + "]";
	}











	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Gene) {
			String help = this.getChromosome_map_location();
			String ok = ((Gene) o).chromosome_map_location;
			
			if(help.equals(ok)) {
				return 0;
			} 
			else if (help.equals("-")) {
				return 1;
			}
			else if (ok.equals("-")) {
				return -1;
			}
			else {
			return this.getChromosome_map_location().compareTo(((Gene) o).chromosome_map_location);
			} 
			
			
		}
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
