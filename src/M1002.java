import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1002 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double area, n, raio;

        n = 3.14159;
        raio = Double.parseDouble(in.readLine());
        area = n * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n", area);

    }

}
