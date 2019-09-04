package ca.csf.dfc.poo.bridge.classes;

public class Carre extends Shape {
	 
    public Carre(Color color) {
        super(color);
    }
 
    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}