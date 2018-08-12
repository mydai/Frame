package exterior;

public class ExteriorTest {
public static void main(String[] args) {
	DvdPlayer dvd = new DvdPlayer();
	Lights lights = new Lights();
	PopcornPopper popper = new PopcornPopper();
	Screen screen = new Screen();
	
	HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvd, lights, screen, popper);
	homeTheaterFacade.watchMovie();
	homeTheaterFacade.endMovie();
}
}
