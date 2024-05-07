package iphone.apps;

public class MusicReproductor implements Ipod{
	public void select() {
		System.out.println("Selecionando música");
	}
	public void play() {
		System.out.println("Tocando música");
	}
	public void pause() {
		System.out.println("Pausando música");
	}
	public void nextMuisic() {
		System.out.println("Tocando próxima música");
	}
}
