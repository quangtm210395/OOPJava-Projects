
public class Pizza {
     /**
     * Parameter constructor     
     * @param diameter - value of diameter of Pizza
     * @param slice - value of number slices of Pizza
     */
    private double diameter;
    private int slice;

    public Pizza() {
    }
    
    public Pizza(double diameter, int slice) {
        this.diameter = diameter;
        this.slice = slice;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getSlice() {
        return slice;
    }
    

    @Override
    public String toString() {
        return  diameter + "\t" + slice ;
    }
    
    
}
