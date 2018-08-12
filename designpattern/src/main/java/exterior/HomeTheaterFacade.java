package exterior;

public class HomeTheaterFacade {

	private DvdPlayer dvd;
	private Lights lights;
	private Screen screen;
	private PopcornPopper popper;
	
	public HomeTheaterFacade(DvdPlayer dvd,Lights lights,Screen screen,PopcornPopper popper){
		this.dvd = dvd;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMovie(){
		System.out.println("准备好开始看电影...");
		popper.on();
		popper.pop();
		lights.dim();
		screen.down();
		dvd.on();
		dvd.play("星球大战");
	}
	
	public void endMovie(){
		System.out.println("关掉所有的开关...");
		popper.off();
		lights.on();
		screen.up();
		dvd.off();
	}
	
	public DvdPlayer getDvd() {
		return dvd;
	}

	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
	}

	public Lights getLights() {
		return lights;
	}

	public void setLights(Lights lights) {
		this.lights = lights;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public PopcornPopper getPopper() {
		return popper;
	}

	public void setPopper(PopcornPopper popper) {
		this.popper = popper;
	}
	
}
