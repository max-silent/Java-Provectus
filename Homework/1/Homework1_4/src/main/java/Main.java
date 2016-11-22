/**
 * Created by Max on 19.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        float a,b,c,discr,x1,x2;
        a=4f;
        b=8f;
        c=4f;
        discr=b*b-4*a*c;
        if (discr>0){
            x1= (float)((-b-Math.sqrt(b*b-4*a*c))/(2*a));
            x2= (float)((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            System.out.println("The roots are:\n\tx1: "+x1+"\n\tx2: "+x2);
        }
        else if (discr==0){
            x1= (float)((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            System.out.println("The roots are equal:\n\tx1=x2: "+x1);
        }
         else System.out.println("There is no existing roots");
    }
}
