package Figure1;

public class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(String color, boolean filled) {
        super();
        this.color = color;
        this.filled = filled;
    }
    public GeometricObject() {
        super();
        this.color = "white";
        this.filled = false;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled(){
        return filled;
    }

    public void setFilled(Boolean filled){
        this.filled =filled;
    }
    public String showData() {
        return " Color: " + color
                + " Filled: " + filled;
    }
}

