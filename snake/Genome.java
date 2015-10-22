package snake;

import java.util.TreeMap;

//Creates a new genome
public class Genome {
	
	// A map of ids to genes
	public TreeMap<Integer, Gene> genome;
	
	public Genome() {
		genome = new TreeMap<Integer, Gene>();
	}
	
	public void insertGene(int IN, int OUT, double WEIGHT, int ID){
		
	}
	
	public void copyGene(int toCopyid, int newID){
		if(genome.containsKey(toCopyid)){
			Gene toCopy = genome.get(toCopyid);
			int in = toCopy.getIN();
			int out = toCopy.getOUT();
			double weight = toCopy.getWEIGHT();
			insertGene(in, out, weight, newID);
		}
	}
	
	public void pointMutate(){
		
	}
	
	public void linkMutate(){
		
	}
	
	public void nodeMutate(){
		
	}
	
	public void enableDisableMutate(){
		
	}
	
	public void mutate(){
		
	}
	
	public void weights(){
		
	}
	
	public void sigmoid(){
		
	}
	
}
