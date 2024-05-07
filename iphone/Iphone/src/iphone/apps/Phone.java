package iphone.apps;

public class Phone implements Telephone {
	public void call() {
		System.out.println("Ligando...");
	}
	public void answer() {
			System.out.println("Desligando ligação");
	}
}
