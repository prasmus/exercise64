/**
 * Created by opilane on 17.11.2016.
 */
public class exercise64 {

    public static double multadd(double a, double b, double c) {
        return a * b + c;

    }
    public static void main(String[] args) {
        System.out.print("The multadd result is: " + multadd(1.0, 2.0, 3.0));
        System.out.println();

        System.out.print("sin(pi/4)+cos(pi/4)/2= " + multadd(Math.cos(Math.PI/4.0), 1 / 2, Math.sin(Math.PI / 4.0)));
        System.out.println();

        System.out.print("log10 + log20 = " + multadd(1.0, Math.log(10), Math.log(20)));
        System.out.println();

        System.out.print("expsum'i vastus on: " + expSum(5.0));

    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

}
