package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;

    //constructor fara parametrii

    public Form() {
        this.color = "white";
    }


    //constructor cu parametrii
    public Form (String color) {
        this.color = color;

    }



    //metoda tip getArea ()
    public float getArea(){
        return 0;
    }

    //metoda toString()
    @Override
    public String toString (){
        return "This form has the color"+color;

    }
}
