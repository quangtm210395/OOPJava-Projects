
import java.text.DecimalFormat;


public class VNMotor extends Motor{  
   
    public String code;
    
    public VNMotor(String name, double price, String code) { 
        super(name, price);
        this.code = code;
    }    
    
    public Double salePrice(){
        DecimalFormat df = new DecimalFormat("###.##");
        if (code.startsWith("V") || code.startsWith("v")) {
            
            return price;
        } else {

            return price*0.9;
        }
    }

     @Override
    public String toString() {
        String s1 = null;
        return s1.format("%s\t%.2f\t%.2f", name,price,salePrice());
    }
    
    
    
}
