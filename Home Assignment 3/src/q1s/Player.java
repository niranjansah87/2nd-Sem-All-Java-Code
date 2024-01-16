package q1s;

public interface Player {
	abstract void play();
}
class Cricket implements Player{
	public void play() {
		System.out.println("Cricket player....");
	}
}
