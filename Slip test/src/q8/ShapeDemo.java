package q8;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s;
		Rectangle r=new Rectangle();
		r.display();
		Cuboid c=new Cuboid();
		System.out.println("Edges"+c.edges()+" Vertices:"+c.vertices()+" Length:"+c.length+" Breadth:"+c.breadth+" Height:"+c.height+" Volume:"+c.volume());;
		

	}

}
