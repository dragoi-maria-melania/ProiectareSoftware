package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private float radius;


    //constructor fara parametrii

    public Circle(){
        super();
        this.radius = 0;
    }

    // constructor cu parametrii

    public Circle (float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Circle with radius = " + radius;
    }

}
//