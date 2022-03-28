/**
 * @author Rafae Camacho Roldán <za18012202@zapopan.tecmm.edu.mx>
 */

import java.text.DecimalFormat;
import java.util.*;
public class MLR {

    public static void main(String[] args) {
          DecimalFormat df = new DecimalFormat("#.00");
          Scanner in = new Scanner(System.in);
          Crammer c = new Crammer();
          
          System.out.println("ŷ = β0 + β1x1 + β2x2");
          System.out.println("ŷ = "+df.format(c.beta0)+" + "+df.format(c.beta1)+"*x1 + "+df.format(c.beta2)+"*x2");
          
          System.out.println("\nType X1 value:");
          Double data1 = in.nextDouble();
          System.out.println("\nType X2 value:");
          Double data2 = in.nextDouble();
          System.out.println("\nŷ = "+df.format(c.predict(c.beta0, c.beta1, c.beta2, data1, data2)));
    }
    
}
