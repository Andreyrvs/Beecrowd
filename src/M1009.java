import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1009 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String nome;
        double salarioFixo, totalVendas, TOTAL, porcentegem;

        porcentegem = 0.15;
        nome = in.readLine();
        salarioFixo = Double.parseDouble(in.readLine());
        totalVendas = Double.parseDouble(in.readLine());

        TOTAL = (totalVendas * porcentegem) + salarioFixo;

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);


    }

}