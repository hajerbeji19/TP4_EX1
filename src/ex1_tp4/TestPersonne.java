package ex1_tp4;

abstract class Personne{
	public String name;
	public Personne(String name) {
		this.name=name;
	}
	abstract void affiche();
}
class Etudiant extends Personne{
	public Etudiant(String name) {
		super(name);
	}
	@Override
	void affiche() {
		System.out.println("Je suis "+name+" l'étudiant");
	}
}
class Enseignant extends Personne{
	public Enseignant(String name) {
		super(name);
	}
	@Override
	void affiche() {
		System.out.println("Je suis "+name+" l'enseignant");
	}
}
class Agent extends Personne{
	public Agent(String name) {
		super(name);
	}
	@Override
	void affiche() {
		System.out.println("Je suis "+name+" l'agent administratif");
	}
}

public class TestPersonne {
	public static void main(String[] args) {
		Personne[] personnes = new Personne[4];
		personnes[0] = new Etudiant("Ali");
		personnes[1] = new Enseignant("Sofiane");
		personnes[2] = new Agent("Hichem");
		personnes[3] = new Etudiant("Hichem");
		for (Personne p : personnes) {
			p.affiche();
		}
	}
	
}
