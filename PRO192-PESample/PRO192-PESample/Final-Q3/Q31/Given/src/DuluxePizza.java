
public class DuluxePizza extends Pizza{
    /**
     * Parameter constructor
     * @param addedTopping - value of addedTopping of Pizza
     * @param diameter - value of diameter of Pizza
     * @param slice - value of number slices of Pizza
     */
    private String addedTopping;

    public DuluxePizza() {
    }
    
    
    
    public DuluxePizza(String addedTopping, double diameter, int slice) { 
        super(diameter, slice);
        this.addedTopping = addedTopping;
    }

    public String getAddedTopping() {
        return addedTopping;
    }

    public void setAddedTopping(String addedTopping) {
        this.addedTopping = addedTopping;
    }

    @Override
    public void setSlice(int slice) {
        super.setSlice(slice); 
    }

    @Override
    public void setDiameter(double diameter) {
        super.setDiameter(diameter); 
    }

    @Override
    public int getSlice() {
        return super.getSlice(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDiameter() {
        return super.getDiameter(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return addedTopping + "\t" + this.getDiameter() + "\t" + this.getSlice();
    }
    
    
}
