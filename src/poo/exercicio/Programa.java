package exercicio;
import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        Calendar data = Calendar.getInstance();

        Gerente gerente = new Gerente();
        gerente.setSalario(5000.00);
        System.out.printf("\nImposto de renda a ser pago pelo Gerente é R$ " + gerente.calculaImposto()+ " EM: %tc \n",data);

        Atendente atendente = new Atendente();
        atendente.setSalario(3000.0);
        System.out.println("Imposto de renda a ser pago pelo Atendente é R$ " + atendente.calculaImposto()+ "\n");

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(4000.0);
        System.out.println("Imposto de renda a ser pago pelo Supervisor é R$ " + supervisor.calculaImposto() + "\n");



    }




}
