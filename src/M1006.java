import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1006 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double MEDIA, A, B, C, pesoA, pesoB, pesoC;

        pesoA = 2;
        pesoB = 3;
        pesoC = 5;
        A = Double.parseDouble(in.readLine());
        B = Double.parseDouble(in.readLine());
        C = Double.parseDouble(in.readLine());
        MEDIA = ((A * pesoA) + (B * pesoB) + (C * pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }

}