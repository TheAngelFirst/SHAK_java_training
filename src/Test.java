import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        double[] i = {11.0, 5.8, 11.1, 10.9};
        double min  = Double.MAX_VALUE;
        for (double x:i) {
            min = Math.min(min, x);
        }
        System.out.println(min);




    }
}
