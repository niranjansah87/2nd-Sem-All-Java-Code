package pack1;
public class Dictionary {
private int stuno;
private String stuname;
Long stumobile;

public Dictionary(int stuno, String stuname, Long stumobile2){
	this.stuno = stuno;
	this.stuname = stuname;
	this.stumobile = stumobile2;
}
public String toString() {
	return stuno+" "+stuname+" "+stumobile;
}
}
