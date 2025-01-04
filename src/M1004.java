import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1004 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int PROD, A, B;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());
        PROD = A * B;

        System.out.println("PROD = " + PROD);

    }

}