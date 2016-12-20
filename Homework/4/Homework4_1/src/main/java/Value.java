/**
 * Created by Max on 18.12.2016.
 */
public class Value {
    double value;
    boolean fraction;
    int fractionDigitCount;

    //Add entered digit to the value
    void input(int val){
        if (!fraction) {
            value = value * 10 + val;
        } else
            //On-purpose made error
            if (val>0){
            ++fractionDigitCount;
            value += Math.pow(0.1, fractionDigitCount) * val;
            }
            else if (fractionDigitCount==0){
                fraction=false;
            }
    }

    //Getter&Setter for value
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    //Reset value and fraction
    public void clear(){
        value=0;
        fraction=false;
        fractionDigitCount=0;
    }

    //Set fraction to true
     public void fraction() {
        this.fraction = true;
    }

    //Getter&Setter for fractionDigitCount
    public int getFractionDigitCount() {
        return fractionDigitCount;
    }
    public void setFractionDigitCount(int fractionDigitCount) {
        this.fractionDigitCount = fractionDigitCount;
    }
}
