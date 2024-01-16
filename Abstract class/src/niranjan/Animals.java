package niranjan;

abstract class Animals {
	public abstract void speak();
	
		public void cat()
		{
			System.out.println("Cat meows");
		}
	}
	class Dogs extends Animals{
		public void speak()
		{
			System.out.println("Dogs bark");
		}
	}


