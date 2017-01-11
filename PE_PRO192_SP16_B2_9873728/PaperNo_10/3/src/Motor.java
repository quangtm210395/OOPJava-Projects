public class Motor {
   
    public String name;
    public double price;
    
    public Motor(String name, double price) {
        this.name = name;
        this.price = Math.max(0,price);
    }    

    @Override
    public String toString() {
        String s1 = null;
        return s1.format("%s\t%.2f", name,price);
    }
    
    

}
