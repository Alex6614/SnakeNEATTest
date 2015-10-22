package snake;

//Creates a new population of genomes
public class NetworkPopulation {
	
	int initialNumberOfGenomes;
	int numberOfInputs;
	int numberOfOutputs;
	int idCounter;
	
	public NetworkPopulation() {
		idCounter = 0;
	}
	
	// Returns the next counter and increments by one
	public int idCounter(){
		int counter = idCounter;
		idCounter++;
		return counter;
	}
	
	// Remove the weak species from a population
	public void removeWeakSpecies(){
		
	}
	// Handles all mutations possible before a crossover

	
	public void crossOver(){
		
	}
	
	public boolean isSameSpecies(){
		return false;
	}
	
	public void updateSpecies(){
		
	}
	
	public void speciesAvgFitness(){
		
	}
	
	public void popAvgFitness(){
		
	}
	
	public void rankSpecies(){
		
	}
	
	public void cullSpecies(boolean finish){
		
	}
	
	public void makeChild(){
		
	}
}
