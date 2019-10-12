package alakzatok;

import java.util.Date;

public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + '\n' + "color: " + this.color + " and filled: " + this.filled;
    }
    
}
