import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1005 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double MEDIA, A, B, pesoA, pesoB;

        pesoA = 3.5;
        pesoB = 7.5;
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        MEDIA = ((A * pesoA) + (B * pesoB)) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", MEDIA);

    }

}