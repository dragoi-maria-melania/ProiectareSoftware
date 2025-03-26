package ro.ulbs.paradigme.lab2;

class Square extends Form {
    private float side;

//constructor fara parametrii
    public Square(){
super();
this.side = 0;
    }
    //constructor cu parametrii
    public Square(float side, String color){
        super(color);
        this.side = side;
    }

    @Override
    public float getArea(){
        return side*side;

    }

    @Override
    public String toString() {
        return super.toString() + "Square with side = " + side;

    }
}
//