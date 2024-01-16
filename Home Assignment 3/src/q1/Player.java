package q1;

interface Player {
	abstract void play();

}
class Cricket implements Player{

	@Override
	public void play() {
		System.out.println("Cricket Player");
		
	}
	
}

