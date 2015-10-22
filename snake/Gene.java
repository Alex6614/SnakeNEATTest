package snake;

// Handles genes
public class Gene {
	int in;
	int out;
	double weight;
	boolean enabled; // True for enabled, false for disabled
	int id;
	
	public Gene(int IN, int OUT, double WEIGHT, int ID) {
		in = IN;
		out = OUT;
		weight = WEIGHT;
		id = ID;
	}
	
	public void setEnabled(boolean a){
		enabled = a;
	}

	public int getIN() {
		return in;
	}

	public int getOUT() {
		return out;
	}

	public double getWEIGHT() {
		return weight;
	}

}
