package ca.csf.dfc.poo.bridge.classes;

public abstract class Shape {
    protected Color color;
     
    //standard constructors
     
    public Shape(Color color2) {
		this.color = color2;
	}

	abstract public String draw();
}
