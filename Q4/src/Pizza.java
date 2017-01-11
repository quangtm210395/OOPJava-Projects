
public class Pizza {
     /**
     * Parameter constructor     
     * @param diameter - value of diameter of Pizza
     * @param slice - value of number slices of Pizza
     */
    
    private double diameter;
    private int slice;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }
    
    
    
    public Pizza(double diameter, int slice) {
        this.diameter = diameter;
        this.slice= slice;
//        throw new UnsupportedOperationException(
//                "Remove this line and implement your code here!");
    } 
}
