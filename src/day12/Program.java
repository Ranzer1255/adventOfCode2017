package day12;

import java.util.List;

public class Program {
	public final int ID;
	private List<Program> connections;

	public Program(int id, List<Program> connections) {
		
		ID=id;
		this.connections=connections;
	}
	
	public Program(int id){
		ID=id;
	}
	
	public void addConnection(Program p){
		connections.add(p);
	}
}