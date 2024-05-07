package iphone;

import iphone.apps.Browser;
import iphone.apps.MusicReproductor;
import iphone.apps.Phone;


public class Iphone {
	public static void main(String[] args) {
		Browser safari = new Browser();
		
		safari.openBrowser();
		safari.openNewPage();
		safari.closeBrowser();
		
		Phone phone = new Phone();
		
		phone.call();
		phone.answer();
		
		MusicReproductor ipod = new MusicReproductor();
		
		ipod.select();
		ipod.play();
		ipod.pause();
		ipod.nextMuisic();
	}
}
