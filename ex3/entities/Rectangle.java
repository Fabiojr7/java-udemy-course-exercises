package ex3.entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return width*height;
    }
    public double Perimeter(){
        return (2*(width+height));
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2)+Math.pow(height,2));
    }

    public String toString(){
        return "\nAREA = "
            + String.format("%.2f", Area())
            +  "\nPERIMETER = "
            + String.format("%.2f", Perimeter())
            + "\nDIAGONAL = "
            + String.format("%.2f", Diagonal());
    }
}
