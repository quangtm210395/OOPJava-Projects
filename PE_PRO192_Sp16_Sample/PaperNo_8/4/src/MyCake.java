
import java.util.ArrayList;
//Your job is to complete this class 

public class MyCake implements ICake {

    /**
     * Get the name of the first Cake which has highest sales price
     *
     * @param a - list of Cake objects
     * @return - name of the first cake which has highest sales price
     */
    @Override
    public String getHighestPrice(ArrayList<Cake> a) {
        double max = 0;
        int index = 0;
        for (int i = 0;i < a.size(); i++) {
            if ((a.get(i).price + a.get(i).itax) > max) {
                max = a.get(i).price + a.get(i).price * a.get(i).itax/100;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (max == (a.get(i).price + a.get(i).price * a.get(i).itax/100)) {
                index = i;
                break;
            }
        }
        return a.get(index).name;
    }

    /**
     * Get return the number of Cakes that have imported tax less than the
     * imported tax of the first Cake in the list
     *
     * @param a - list of Cake objects
     * @return - number of Cakes that have imported tax less than the imported
     * tax of the first Cake in the list
     */
    @Override
    public int count(ArrayList<Cake> a) {
        int count = 0;
        double itax = a.get(0).itax;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i).itax < itax) {
                count ++;
            }
        }
        return count;
    }
}
