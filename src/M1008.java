import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M1008 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int NUMBER, workHours;
        double SALARY, paidHours;

        NUMBER = Integer.parseInt(in.readLine());
        workHours = Integer.parseInt(in.readLine());
        paidHours = Double.parseDouble(in.readLine());

        SALARY = workHours * paidHours;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);



    }

}